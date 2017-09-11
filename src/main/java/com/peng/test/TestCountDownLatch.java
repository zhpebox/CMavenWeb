package com.peng.test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch {
    public static void main(String[] args) {
        final CDLBusniness busniess = new CDLBusniness(5);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    busniess.Referee();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        for (int i = 1; i <=5 ; i++) {
            final int current = i;
            final Random r = new Random();

            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(r.nextInt(1500));
                        busniess.Athlete(current);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        service.shutdown();
    }
}


class CDLBusniness {
    private final CountDownLatch athlete;

    private final CountDownLatch start = new CountDownLatch(1);

    private final CountDownLatch goal;

    public CDLBusniness(int numOfAthlete) {
        this.athlete = new CountDownLatch(numOfAthlete);
        this.goal = new CountDownLatch(numOfAthlete);
    }

    //运动员的动作
    public void Athlete(int id) throws InterruptedException {
        athlete.countDown();
        System.out.println("Athlete " + id + " has been in place.");
        start.await();
        System.out.println("Athlete " + id + " is running.");
        Random r = new Random();
        Thread.sleep(1000 + r.nextInt(3000));
        System.out.println("Athlete " + id + " has reached the goal!");
        goal.countDown();
    }

    //裁判的动作
    public void Referee() throws InterruptedException {
        System.out.println("Referee has been in place.");
        athlete.await();
        Random r = new Random();
        System.out.println("ready!");
        Thread.sleep(r.nextInt(2000));
        start.countDown();
        System.out.println("Referee: Match start!");
        goal.await();
        System.out.println("Referee: Match end!");
    }
}

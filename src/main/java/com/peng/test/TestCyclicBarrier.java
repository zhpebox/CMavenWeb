package com.peng.test;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 用场景：在某种需求中，比如一个大型的任务，常常需要分配很多子任务去执行，只有当所有子任务都执行完成时候，
 * 才能执行主任务，这时候，就可以选择CyclicBarrier了。
 */
public class TestCyclicBarrier {
    public static void main(String args[]) {
        ExecutorService service = Executors.newCachedThreadPool();
        final  CBBusiness business = new CBBusiness();
        for (int i = 0; i < 3; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    business.execute();
                }
            });
        }
    }

}

class CBBusiness{
    private final CyclicBarrier checkPoint = new CyclicBarrier(3);

    public void execute() {
        try {
            Random rand = new Random();
            Thread.sleep(rand.nextInt(5000));
            System.out.println("Checkpoint 1:"+checkPoint.getNumberWaiting());
            checkPoint.await();

            Thread.sleep(rand.nextInt(5000));
            System.out.println("Checkpoint 2:"+checkPoint.getNumberWaiting());
            checkPoint.await();

            Thread.sleep(rand.nextInt(5000));
            System.out.println("Checkpoint 3:"+checkPoint.getNumberWaiting());
            checkPoint.await();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

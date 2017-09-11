package com.peng.test;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

import static java.lang.System.out;

public class CommonTestClass {
    public static void main(String args[]) {
        MyThread chuangkou1 = new MyThread(1);
        MyThread chuangkou2 = new MyThread(2);
        MyThread chuangkou3 = new MyThread(3);
        MyThread chuangkou4 = new MyThread(4);
        new Thread(chuangkou1).start();
        new Thread(chuangkou2).start();
        new Thread(chuangkou3).start();
        new Thread(chuangkou4).start();
    }

}

class MyThread implements Runnable {
    int index = 0;

    public MyThread(int index) {
        this.index = index;
    }

    public MyThread() {
    }

    static int tickets = 20;

    @Override
    public void run() {
        while (true) {
            //   synchronized (this) {
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                out.println("now is sail " + tickets + " 张 票，买票窗口：" + index + "-" + Thread.currentThread().getName());
                tickets--;
            } else {
                out.println("窗口：" + index + "-" + Thread.currentThread().getName() + "票已经卖完");
                out.println("");
                break;
            }
            //   }
        }
    }
}
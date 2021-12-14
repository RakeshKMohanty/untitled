package com.core.leetcode.thread;

public class Multidemo {

    public static void main(String[] args) throws InterruptedException {

        Multidemo multidemo = new Multidemo();
        multidemo.mainThread();

        Thrddemo thd = new Thrddemo();
        Thread thread = new Thread(() -> System.out.println("Inside the thread"));
        Thread thread1 = new Thread(thd);
        thread1.start();
        thread1.setName("Child Thread");
        //Thread thread2 = new Thread(thd);
        //thread2.start();

        /*for (int i = 0; i <= 10; i++) {
            System.out.println("Inside main method " + Thread.currentThread());
        }*/
        //Thread t1 = new Thread(thd).start();
    }

    public synchronized void mainThread() throws InterruptedException {

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);

        }

        wait();
    }
}

class Thrddemo implements Runnable {

    public synchronized void executeTask() throws InterruptedException {
        for (int i = 0; i <= 10; i += 1) {
            System.out.println(i);
        }
        notify();
    }

    @Override
    public void run() {
        try {
            executeTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

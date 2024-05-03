package org.example;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread iteration " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

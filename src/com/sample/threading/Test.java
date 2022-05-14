package com.sample.threading;

public class Test {

    public static void main(String args[]){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Thread name "+Thread.currentThread().getName());
                System.out.println("new Thread priority "+Thread.currentThread().getPriority());

            }
        });
        t1.setName("Thread worker");
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("WE are in thread "+Thread.currentThread().getName()+" before new thread ");
        t1.start();
        System.out.println("WE are in thread "+Thread.currentThread().getName()+" after new thread ");

    }
}

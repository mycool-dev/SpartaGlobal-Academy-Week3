package com.sparta.me.concurrency;

public class ThreadBasics {
    public static class MyThreadWithInterface implements Runnable { //creating a thread using the Runnable Interface

        @Override
        public void run() {
            System.out.println("Hello from my Thread Interface!");
        }
    }

    public static class MyThreadWithClass extends Thread { //creating a thread using the Thread class
        @Override
        public void run() {
            System.out.println("Hello from my Thread Class!");
        }
    }

    public static void main(String[] args) {
        System.out.println(Util.getThreadName());
        Thread thread = new Thread(new MyThreadWithInterface());
        thread.start();

        MyThreadWithClass myThreadWithClass = new MyThreadWithClass();
        myThreadWithClass.start();
    }
}

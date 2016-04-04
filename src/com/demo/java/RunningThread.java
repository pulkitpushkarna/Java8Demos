package com.demo.java;

public class RunningThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        };
        new Thread(runnable).start();

        new Thread(() -> System.out.println("In another Thread via lambda")).start();
    }
}

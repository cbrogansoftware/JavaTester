package com.csbTester.thread;

import java.util.concurrent.TimeUnit;

public class SomeProcessor2 implements Runnable{
    int thread;

    public SomeProcessor2(){}

    public SomeProcessor2(int thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        takeLongTime();
    }

    public void takeLongTime(){
        int millis = 2000;
        try {
            TimeUnit.MILLISECONDS.sleep(millis);// Make sure process takes long enough to show concurrency.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SomeProcessor2 finished taking a long time");
    }
}

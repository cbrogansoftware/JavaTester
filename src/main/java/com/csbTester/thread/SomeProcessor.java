package com.csbTester.thread;

import java.util.concurrent.TimeUnit;

public class SomeProcessor implements Runnable{
    int thread;
    int x, y;

    public SomeProcessor() {
    }

    public SomeProcessor(int x, int y, int thread){
        this.x = x;
        this.y = y;
        this.thread = thread;
    }

    @Override
    public void run() {
//        processThis();
        takeLongTime();
    }

    public int add() {
        try {
            TimeUnit.MILLISECONDS.sleep(2000);// Make sure process takes long enough to show concurrency.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this.x + this.y;
    }

    public void processThis(){
        add();
        printIt();
    }

    public void printIt(){
        System.out.println("x=" + getX() + " y=" + getY() + " t=" + getThread());
    }

    public int getThread() {
        return thread;
    }

    public void setThread(int thread) {
        this.thread = thread;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void reset(){
        this.x = 0;
        this.y = 0;
        this.thread = 0;
    }

    public void takeLongTime(){
        int millis = 2000;
        try {
            TimeUnit.MILLISECONDS.sleep(millis);// Make sure process takes long enough to show concurrency.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SomeProcessor finished taking a long time");
    }
}

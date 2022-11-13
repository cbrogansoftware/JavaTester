package com.csbTester.thread;

public class MainThread {

    public static void main(String[] args) {
//        int x = 1;
//        int y = 2;
        SomeProcessor someProcessor = new SomeProcessor();
        SomeProcessor2 someProcessor2 = new SomeProcessor2();

        Thread myThread1 = new Thread(someProcessor);
        Thread myThread2 = new Thread(someProcessor2);

        myThread1.start();
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread2.start();


//        for(int i=1;i<6;i++){
//            x = x + i;
//            y = x + i;
////            SomeProcessor someProcessor = new SomeProcessor(x, y, i);
////            someProcessor = new SomeProcessor(x, y, i);
//            someProcessor = new SomeProcessor();
//
////            someProcessor.reset();
//            someProcessor.setThread(i);
//            someProcessor.setX(x);
//            someProcessor.setY(y);
//            Thread myThread = new Thread(someProcessor);
//            try {
//                Thread.sleep(0);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            myThread.start();
//        }

    }

}

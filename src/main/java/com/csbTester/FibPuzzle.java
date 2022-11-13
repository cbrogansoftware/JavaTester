package com.csbTester;

import java.util.ArrayList;
import java.util.List;

public class FibPuzzle {

    public static void fibSeqLoop(int count){
        int n1 = 0, n2 =1, sumPrev;

        //System.out.print(n1 + " " + n2);

        for (int i=0;i<count;i++){

            System.out.print(n1 + " ");

            sumPrev = n1 + n2;
            n1 = n2;
            n2 = sumPrev;
        }

    }

    public static void fibSeqLoop2(int count){

        int n1 = 0, n2 = 1, sumPrev;

        for (int i=0;i<count;i++){

            System.out.print(n1 + " ");

            sumPrev = n1 + n2;
            n2 = n1;
            n1 = sumPrev;

        }
    }

    public static void fibSeqLoop3(int count){
        int n1=0, n2=1, sumPrev;

        for (int i=0;i<count;i++){
            System.out.print(n1+" ");

            sumPrev = n1 + n2;
            n1 = n2;
            n2 = sumPrev;
        }
    }

    static int tn1=0, tn2=1, tsumPrev;
    public static void fibSeqRec(int countLocal){

        if(countLocal>0) {

            System.out.print(tn1 + " ");

            tsumPrev = tn1 + tn2;
            tn1 = tn2;
            tn2 = tsumPrev;

            fibSeqRec(countLocal - 1);
        }
    }

    static void lambda1(int count){

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.forEach(n -> System.out.println(n));
        
    }

    public static void main(String[] args) {

        //fibSeqLoop3(10);
        int count = 10;
        fibSeqRec(count);
    }
}

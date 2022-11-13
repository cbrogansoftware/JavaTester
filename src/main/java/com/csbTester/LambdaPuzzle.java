package com.csbTester;

import java.util.ArrayList;
import java.util.HashMap;

public class LambdaPuzzle {
    static void lambdaList(){

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.forEach((n) -> System.out.println(n));

    }

    static void lambdaMap(){

        HashMap<Integer,String> myMap = new HashMap<Integer, String>();
        myMap.put(0, "a");
        myMap.put(1, "b");
        myMap.put(2, "c");
        myMap.forEach((n, v) -> System.out.println(n + ":" + v));
    }

    interface StringFunction{
        String run(String str);
    }

    static void lambdaFormatter(String str, StringFunction func){
        // on hold
    }

    public static void main(String[] args) {

        lambdaList();
        //lambdaMap();

    }
}

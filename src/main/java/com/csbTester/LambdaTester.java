package com.csbTester;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTester {

    public static void main(String args[]){

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(5);
        numbers1.add(9);
        numbers1.add(8);
        numbers1.add(1);
        numbers1.forEach( (n) -> { System.out.println("no var: " + n); } );

        // Or stored in a var of special type (lookup specs)
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(5);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(1);
        Consumer<Integer> method = (n) -> { System.out.println("var:" + n); };
        numbers2.forEach( method );
    }
}

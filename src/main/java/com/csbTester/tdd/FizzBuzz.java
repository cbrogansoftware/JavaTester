package com.csbTester.tdd;

public class FizzBuzz {

    public String convert(int lInt){

        if(lInt % 3 == 0 && lInt % 5 == 0) return "FizzBuzz";
        if (lInt % 3 == 0) return "Fizz";
        if (lInt % 5 == 0) return "Buzz";

        return String.valueOf(lInt);
    }

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i=1;i<=100;i++){
            System.out.println("i-" + i + " c-" + fizzBuzz.convert(i));
        }


    }
}

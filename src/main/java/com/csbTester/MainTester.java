package com.csbTester;
import com.csbTester.Foo;

import java.util.ArrayList;
import java.util.Arrays;

class Animal{
    void playSound(){
        System.out.println("animalSound");
    }
}
abstract class abAnimal{
    public abstract void playSound();

    public void sleep(){
        System.out.println("zzz");
    }
}
class Dog extends abAnimal{

    public void playSound(){
        System.out.println("bark");
    }
}

public class MainTester {

//    Foo foo = new Foo();

    //Foo.alpha();

    static void myPrint(){
        System.out.println("test");
    }

    public static void  main(String[] args) {
        System.out.println("hello");

//        Foo.alpha();
//        Foo.beta();

        // Stream simple example with lambda and modulus for evens, using method reference syntax for println.
        int[] ints = {0, 1, 3, 5, 8, 13, 21, 34};
        Arrays.stream(ints).filter(x -> x % 2 == 0).forEach(System.out::println);



    }
}

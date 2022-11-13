package com.csbTester.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    /*
        FizzBuzz Requirements
        If multiple of 3 print Fizz
        If multiple of 5 print Buzz
        If multiple of 3 and 5 print FizzBuzz
     */

    @Test
    public void doesMultOfThreeReturnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void doesMultOfFiveReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void doesMultOfThreeAndFiveReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }


}
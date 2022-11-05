package edu.wctc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fb;

    @BeforeEach
    void setup() {
        fb = new FizzBuzz();
    }

//    @Test
//    void canCreateFizzBuzz() {
////        FizzBuzz fizzBuzz = new FizzBuzz();
//    }

    @Test
    void one() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
        String s = fb.fizzBuzz(1);
        assertEquals("1", s);
    }

    @Test
    void two() {
        String s = fb.fizzBuzz(2);
        assertEquals("2", s);
    }

    @Test
    void Three() {
        String s = fb.fizzBuzz(3);
        assertEquals("Fizz", s);
    }

    @Test
    void five() {
        String s = fb.fizzBuzz(5);
        assertEquals("Buzz", s);
    }

    @Test
    void six() {
        String s = fb.fizzBuzz(6);
        assertEquals("Fizz", s);
    }

    @Test
    void ten() {
        String s = fb.fizzBuzz(10);
        assertEquals("Buzz", s);
    }

    @Test
    void fifteen() {
        String s = fb.fizzBuzz(15);
        assertEquals("FizzBuzz", s);
    }

    @Test
    void thirty() {
        String s = fb.fizzBuzz(30);
        assertEquals("FizzBuzz", s);
    }


}

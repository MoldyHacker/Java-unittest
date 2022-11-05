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


}

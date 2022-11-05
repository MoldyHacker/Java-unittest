package edu.wctc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void canCreateFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
    }

    @Test
    void one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String s = fizzBuzz.fizzBuzz(1);
        assertEquals("1", s);
    }
}

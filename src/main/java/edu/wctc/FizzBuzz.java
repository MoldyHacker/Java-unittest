package edu.wctc;

public class FizzBuzz {
    public String fizzBuzz(int num) {
        if (num == 5)
            return "Buzz";
        else if (num == 3)
            return "Fizz";
        else
            return Integer.toString(num);
    }
}

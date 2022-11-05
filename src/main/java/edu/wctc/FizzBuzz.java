package edu.wctc;

public class FizzBuzz {
    public String fizzBuzz(int num) {
        if (num == 15)
            return "FizzBuzz";
        else if (num % 5 == 0)
            return "Buzz";
        else if (num % 3 == 0)
            return "Fizz";
        else
            return Integer.toString(num);
    }
}

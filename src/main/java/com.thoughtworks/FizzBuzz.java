package com.thoughtworks;

public class FizzBuzz {

    public String say(int i) {
        boolean IsDevidedBy3 = i % 3 == 0;
        boolean IsDevidedBy5 = i % 5 == 0;
        if (IsDevidedBy3 && IsDevidedBy5) {
            return "FizzBuzz";
        }
        if (IsDevidedBy3) {
            return "Fizz";
        }
        if (IsDevidedBy5) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
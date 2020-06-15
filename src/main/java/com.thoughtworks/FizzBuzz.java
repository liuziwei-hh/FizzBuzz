package com.thoughtworks;

public class FizzBuzz {

    public String say(int i) {
        boolean IsDevidedBy3 = i % 3 == 0;
        boolean IsDevidedBy5 = i % 5 == 0;
        boolean IsDevidedBy7 = i % 7 == 0;
        if (IsDevidedBy3 && IsDevidedBy5&&IsDevidedBy7) {
            return "FizzBuzzWhizz";
        }
        if (IsDevidedBy3 && IsDevidedBy7) {
            return "FizzWhizz";
        }
        if (IsDevidedBy5 && IsDevidedBy7) {
            return "BuzzWhizz";
        }
        if (IsDevidedBy3 && IsDevidedBy5) {
            return "FizzBuzz";
        }
        if (IsDevidedBy3) {
            return "Fizz";
        }
        if (IsDevidedBy5) {
            return "Buzz";
        }
        if (IsDevidedBy7) {
            return "Whizz";
        }
        return String.valueOf(i);
    }
}
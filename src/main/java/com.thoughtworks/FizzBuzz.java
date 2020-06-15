package com.thoughtworks;

public class FizzBuzz {

    public String say(int i) {
        boolean IsDividedBy3 = i % 3 == 0;
        boolean IsDividedBy5 = i % 5 == 0;
        boolean IsDividedBy7 = i % 7 == 0;
        String word = "";
        if (!DoesContainSeven(i)) {
            if (!DoesContainFive(i)) {
                if (DoesContainThree(i)) {
                    return "Fizz";
                }
            }
        }
        if (DoesContainSeven(i)) {
            if (DoesContainFive(i)) {
                if (IsDividedBy3) {
                    return "Fizz";
                }
            }
        }
        if(DoesContainSeven(i)){
            if(!DoesContainThree(i)){
                if (IsDividedBy3) {
                    word ="Fizz";
                }
            }
        }
        if(DoesContainSeven(i)){
            if(DoesContainThree(i)){
                word="Fizz";
            }
        }
        if(DoesContainSeven(i)){
            if(!DoesContainThree(i)){
                if(IsDividedBy7)
                word="BuzzWhizz";
            }
        }
        if(DoesContainFive(i)){
            if (IsDividedBy7) {
                return word += "Whizz";
            }
        }
        if (!DoesContainFive(i)&&IsDividedBy3) {
            word += "Fizz";
        }
//        if (IsDividedBy5) {
//            word += "Buzz";
//        }
//        if (IsDividedBy7) {
//            return word += "Whizz";
//        }
        if ("" == word) {
            word += String.valueOf(i);
        }
        return word;
    }
    public boolean DoesContainThree(int i) {
        return String.valueOf(i).contains("3");
    }
    public boolean DoesContainFive(int i) {
        return String.valueOf(i).contains("5");
    }
    public boolean DoesContainSeven(int i) {
        return String.valueOf(i).contains("7");
    }
}
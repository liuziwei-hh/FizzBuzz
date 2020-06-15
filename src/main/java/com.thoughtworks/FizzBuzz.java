package com.thoughtworks;

public class FizzBuzz {

    public String say(int i) {
        boolean IsDevidedBy3 = i % 3 == 0;
        boolean IsDevidedBy5 = i % 5 == 0;
        boolean IsDevidedBy7 = i % 7 == 0;
        String word="";
        if (IsDevidedBy3) {
             word+="Fizz";
        }
        if (IsDevidedBy5) {
            word+="Buzz";
        }
        if (IsDevidedBy7) {
            word+="Whizz";
        }
        if(""==word){
            word+=String.valueOf(i);
        }
        return word;
    }
}
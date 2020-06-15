package com.thoughtworks;

public class FizzBuzz {

 public String say(int i){
     boolean IsDevidedBy3=i%3==0;
     if (IsDevidedBy3){
         return "Fizz";
     }
     return String.valueOf(i);
 }
}
package com.thoughtworks;

public class FizzBuzz {

    public String say(int i) {
        boolean IsDividedBy3 = i % 3 == 0;
        boolean IsDividedBy5 = i % 5 == 0;
        boolean IsDividedBy7 = i % 7 == 0;
        String word="";
        if(DoesContainFive(i)&&DoesContainThree(i)){
            word="Buzz";
        }
        if (IsDividedBy7) {
          return word+="Whizz";
        }
        if(DoesContainThree(i)&&!DoesContainFive(i)){
            return "Fizz" ;
         }
        if (IsDividedBy3) {
             word+="Fizz";
        }

        if (IsDividedBy5) {
            word+="Buzz";
        }
        if(""==word){
            word+=String.valueOf(i);
        }
        return word;
    }
    public boolean DoesContainThree(int i) {
        return String.valueOf(i).contains("3");
    }
    public boolean DoesContainFive(int i) {
        return String.valueOf(i).contains("5");
    }

}
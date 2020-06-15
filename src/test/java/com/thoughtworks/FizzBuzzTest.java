package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_given_1 () {
       //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(1);
        //then
        assertThat(num,is("1"));
    }
    @Test
    public void should_return_Fizz_when_given_3 () {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(3);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_Buzz_when_given_5 () {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(5);
        //then
        assertThat(num,is("Buzz"));
    }
    @Test
    public void should_return_FizzBuzz_when_given15 () {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(15);
        //then
        assertThat(num,is("FizzBuzz"));
    }
}

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
    public void should_return_Whizz_when_given_7 () {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(7);
        //then
        assertThat(num,is("Whizz"));
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
    @Test
    public void should_return_FizzBuzz_when_given21 () {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(21);
        //then
        assertThat(num,is("FizzWhizz"));
    }
    @Test
    public void should_return_FizzBuzz_when_given35 () {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(35);
        //then
        assertThat(num,is("BuzzWhizz"));
    }
    @Test
    public void should_return_FizzBuzz_when_given105() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(105);
        //then
        assertThat(num,is("FizzBuzzWhizz"));
    }
    @Test
    public void should_return_Fizz_when_given13() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(13);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_Fizz_when_given30() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(30);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_given35() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(35);
        //then
        assertThat(num,is("BuzzWhizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_given75() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(75);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_given73() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(73);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_given173() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(173);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_given153() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(153);
        //then
        assertThat(num,is("153"));
    } @Test
    public void should_return_BuzzWhizz_when_given753() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(753);
        //then
        assertThat(num,is("Fizz"));
    } @Test
    public void should_return_BuzzWhizz_when_given72() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(72);
        //then
        assertThat(num,is("Fizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_given53() {
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String num=fizzBuzz.say(53);
        //then
        assertThat(num,is("53"));
    }
}

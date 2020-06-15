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
}

package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogCreateTest(){
        //given
        Dog dog = new Dog("Homie");
        String expected = "Homie";
        //when
        String actual = dog.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dogSpeakTest(){
        //given
        Dog dog = new Dog("Homie");
        String expected = "Woof!";
        //when
        String actual = dog.speak();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceTest(){
        Dog dog = new Dog("Homie");

        Assert.assertTrue(dog instanceof Pet);
    }
}

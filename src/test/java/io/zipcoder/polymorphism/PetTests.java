package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {


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
    public void catCreateTest(){
        //given
        Cat cat = new Cat("Side");
        String expected = "Side";
        //when
        String actual = cat.getName();
        //then
        Assert.assertEquals(expected,actual);
    }


}

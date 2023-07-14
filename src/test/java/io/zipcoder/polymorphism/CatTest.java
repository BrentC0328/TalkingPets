package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catCreateTest(){
        //given
        Cat cat = new Cat("Cat");
        String expected = "Cat";
        //when
        String actual = cat.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void catSpeakTest(){
        //given
        Cat cat = new Cat("Cat");
        String expected = "Meow!";
        //when
        String actual = cat.speak();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceTest(){
        Cat cat = new Cat("Homie");

        Assert.assertTrue(cat instanceof Pet);
    }
}

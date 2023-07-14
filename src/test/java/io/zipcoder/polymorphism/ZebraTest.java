package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class ZebraTest {

    @Test
    public void zebraCreateTest(){
        //given
        Zebra zebra = new Zebra("Zebs");
        String expected = "Zebs";
        //when
        String actual = zebra.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void zebraSpeakTest(){
        //given
        Zebra zebra = new Zebra("Zebs");
        String expected = "Neigh but in zebra accent";
        //when
        String actual = zebra.speak();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceTest(){
        Zebra zebra = new Zebra("Zebs");

        Assert.assertTrue(zebra instanceof Pet);
    }
}

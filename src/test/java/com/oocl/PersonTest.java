package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void should_return_correct_personIntroduce() {
        Person Tom = new Person();
        Tom.setName("Tom");
        Tom.setAge("21");
        Assert.assertEquals("My name is Tom. I am 21 years old.",Tom.introduce());
    }
}
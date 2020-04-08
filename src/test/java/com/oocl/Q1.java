package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1 {
    @Test
    public void should_return_correct_personIntroduce() {
        Person tom = new Person();
        tom.setName("Tom");
        tom.setAge("21");
        Assert.assertEquals("My name is Tom. I am 21 years old.", tom.introduce());
    }
}
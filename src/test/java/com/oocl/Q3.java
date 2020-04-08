package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3 {
    @Test
    public void should_return_correct_teacherIntroduce() {

        Teacher tom = new Teacher();
        tom.setName("Tom");
        tom.setAge("18");
        Assert.assertEquals("My name is Tom. I am 18 years old. Teaching for the future of world.", tom.introduce());
    }
}
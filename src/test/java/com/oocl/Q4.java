package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4 {
    @Test
    public void should_return_correct_studentIntroduce_klassnumber() {
        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge("18");
        tom.setKlassNumber("2");
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.", tom.introduce());
    }
}
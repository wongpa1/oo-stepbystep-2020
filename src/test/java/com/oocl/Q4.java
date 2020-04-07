package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4 {
    @Test
    public void should_return_correct_introduceWithClass() {
        Student Tom = new Student();
        Tom.setName("Tom");
        Tom.setClassnumber("2");
        Tom.setAge("18");
        Assert.assertEquals(" My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.",Tom.introduce());

    }
}
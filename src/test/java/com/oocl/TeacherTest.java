package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void name() {
        Teacher Woody = new Teacher();
        Woody.setName("Woody");
        Woody.setAge("30");
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world.",Woody.introduce());
    }
}
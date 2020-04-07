package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void should_return_correct_teacherIntroduce() {

        Teacher Tom = new Teacher();
        Tom.setName("Tom");
        Tom.setAge("18");
        Assert.assertEquals("My name is Tom. I am 18 years old. Teaching for the future of world.",Tom.introduce());
    }
}
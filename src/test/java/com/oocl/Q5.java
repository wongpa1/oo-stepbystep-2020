package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5 {
    @Test
    public void studentJoinKlass() {

        Student Tom = new Student();
        Klass klass = new Klass();

        klass.setKlassnumber("3");
        Tom.setName("Tom");
        Tom.setAge("18");
        Assert.assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL.",Tom.introduce());

        klass.assignStudentToKlass(Tom);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 3. Coding for the glory of OOCL.",Tom.introduce());



    }
}
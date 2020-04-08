package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q5 {
    @Test
    public void studentJoinKlass() {

        Student tom = new Student();
        Klass klass = new Klass();

        klass.setKlassNumber("3");
        tom.setName("Tom");
        tom.setAge("18");
        Assert.assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL.", tom.introduce());

        klass.assignStudentToKlass(tom);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 3. Coding for the glory of OOCL.", tom.introduce());


    }
}
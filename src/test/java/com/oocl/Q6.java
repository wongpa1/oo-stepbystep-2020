package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6 {
    @Test
    public void selectStudentLeader() {
        Student Tom = new Student();
        Student Paul = new Student();
        Klass klassOne = new Klass();
        Klass klassTwo = new Klass();

        Tom.setName("Tom");
        Paul.setName("Paul");
        Tom.setAge("18");
        Paul.setAge("20");
        klassOne.setKlassnumber("1");
        klassTwo.setKlassnumber("2");

        klassOne.assignStudentToKlass(Tom);
        klassTwo.assignStudentToKlass(Paul);

        klassOne.assignStudentLeader(Tom);
        klassOne.assignStudentLeader(Paul);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 1. Coding for the glory of OOCL.",klassOne.getStudentLeader().introduce());


    }
}
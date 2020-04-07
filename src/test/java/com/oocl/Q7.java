package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q7 {
    @Test
    public void assign_teacherToKlass() {
        Teacher Woody = new Teacher();
        Klass klassOne = new Klass();
        Klass klassTwo = new Klass();

        Woody.setName("Woody");
        Woody.setAge("30");
        klassOne.setKlassnumber("1");
        klassTwo.setKlassnumber("2");

        klassOne.assignTeacherToKlass(Woody);
        klassTwo.assignTeacherToKlass(Woody);

        Assert.assertEquals("Woody",klassOne.getTeacher().getName());
        Assert.assertEquals("[1, 2]",klassOne.getTeacher().getKlassList().toString());


    }
}
package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q7 {
    @Test
    public void assign_teacherToKlass() {
        Teacher woody = new Teacher();
        Klass klassOne = new Klass();
        Klass klassTwo = new Klass();

        woody.setName("Woody");
        woody.setAge("30");
        klassOne.setKlassNumber("1");
        klassTwo.setKlassNumber("2");

        klassOne.assignTeacherToKlass(woody);
        klassTwo.assignTeacherToKlass(woody);

        Assert.assertEquals("Woody", klassOne.getTeacher().getName());
        Assert.assertEquals("[1, 2]", klassOne.getTeacher().getKlassList().toString());


    }
}
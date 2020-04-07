package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8 {
    @Test
    public void welcome_from_teacher_to_newly_join_student() {
        Klass klassOne = new Klass();
        Teacher Woody = new Teacher();
        Student Tom = new Student();

        klassOne.setKlassnumber("1");
        Woody.setName("Woody");
        Tom.setName("Tom");
        Woody.setAge("30");
        Tom.setAge("18");

        klassOne.assignTeacherToKlass(Woody);
        String Welcoming = klassOne.assignStudentToKlass(Tom);

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.",Welcoming);
    }
}
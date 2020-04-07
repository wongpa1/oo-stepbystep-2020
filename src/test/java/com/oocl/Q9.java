package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q9 {
    @Test
    public void Welcoming_from_Teacher_to_StudentLeader() {
        Klass klassTwo = new Klass();
        Teacher Woody = new Teacher();
        Student Tom = new Student();

        klassTwo.setKlassnumber("2");
        Woody.setName("Woody");
        Tom.setName("Tom");
        Woody.setAge("30");
        Tom.setAge("18");

        klassTwo.assignTeacherToKlass(Woody);
        klassTwo.assignStudentToKlass(Tom);
        String Welcoming = klassTwo.assignStudentLeader(Tom);

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.",Welcoming);
    }
}
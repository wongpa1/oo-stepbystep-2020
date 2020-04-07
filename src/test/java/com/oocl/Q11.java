package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q11 {
    @Test
    public void Student_Welcoming_Assign_StudentLeader() {
        Klass klassTwo = new Klass();
        Student Jim = new Student();
        Student Tom = new Student();

        klassTwo.setKlassnumber("2");
        Jim.setName("Jim");
        Tom.setName("Tom");
        Jim.setAge("20");
        Tom.setAge("18");

        klassTwo.assignStudentToKlass(Tom);
        klassTwo.assignStudentToKlass(Jim);
        String Welcoming = klassTwo.assignStudentLeader(Jim);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.",Welcoming);
    }
}
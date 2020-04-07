package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q10 {
    @Test
    public void name() {
        Klass klassTwo = new Klass();
        Student Jim = new Student();
        Student Tom = new Student();

        klassTwo.setKlassnumber("2");
        Jim.setName("Jim");
        Tom.setName("Tom");
        Jim.setAge("20");
        Tom.setAge("18");

        klassTwo.assignStudentToKlass(Tom);
        String Welcoming = klassTwo.assignStudentToKlass(Jim);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.",Welcoming);
    }
}
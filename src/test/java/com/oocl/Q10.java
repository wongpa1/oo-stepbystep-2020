package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q10 {
    @Test
    public void name() {
        Klass klassTwo = new Klass();
        Student jim = new Student();
        Student tom = new Student();

        klassTwo.setKlassNumber("2");
        jim.setName("Jim");
        tom.setName("Tom");
        jim.setAge("20");
        tom.setAge("18");

        klassTwo.assignStudentToKlass(tom);
        String Welcoming = klassTwo.assignStudentToKlass(jim);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.", Welcoming);
    }
}
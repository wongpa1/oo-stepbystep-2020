package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q11 {
    @Test
    public void Student_Welcoming_Assign_StudentLeader() {
        Klass klassTwo = new Klass();
        Student Jim = new Student();
        Student tom = new Student();

        klassTwo.setKlassNumber("2");
        Jim.setName("Jim");
        tom.setName("Tom");
        Jim.setAge("20");
        tom.setAge("18");

        klassTwo.assignStudentToKlass(tom);
        klassTwo.assignStudentToKlass(Jim);
        String Welcoming = klassTwo.assignStudentLeader(Jim);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.", Welcoming);
    }
}
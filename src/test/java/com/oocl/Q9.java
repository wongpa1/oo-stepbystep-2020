package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q9 {
    @Test
    public void Welcoming_from_Teacher_to_StudentLeader() {
        Klass klassTwo = new Klass();
        Teacher woody = new Teacher();
        Student tom = new Student();

        klassTwo.setKlassNumber("2");
        woody.setName("Woody");
        tom.setName("Tom");
        woody.setAge("30");
        tom.setAge("18");

        klassTwo.assignTeacherToKlass(woody);
        klassTwo.assignStudentToKlass(tom);
        String Welcoming = klassTwo.assignStudentLeader(tom);

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.", Welcoming);
    }
}
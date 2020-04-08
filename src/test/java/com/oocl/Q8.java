package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q8 {
    @Test
    public void welcome_from_teacher_to_newly_join_student() {
        Klass klassTwo = new Klass();
        Teacher woody = new Teacher();
        Student tom = new Student();

        klassTwo.setKlassNumber("2");
        woody.setName("Woody");
        tom.setName("Tom");
        woody.setAge("30");
        tom.setAge("18");

        klassTwo.assignTeacherToKlass(woody);
        String Welcoming = klassTwo.assignStudentToKlass(tom);

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", Welcoming);
    }
}
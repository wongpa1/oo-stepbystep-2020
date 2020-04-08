package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class Q6 {
    @Test
    public void selectStudentLeader() {
        Student tom = new Student();
        Student paul = new Student();
        Klass klassOne = new Klass();
        Klass klassTwo = new Klass();

        tom.setName("Tom");
        paul.setName("Paul");
        tom.setAge("18");
        paul.setAge("20");
        klassOne.setKlassNumber("1");
        klassTwo.setKlassNumber("2");

        klassOne.assignStudentToKlass(tom);
        klassTwo.assignStudentToKlass(paul);

        klassOne.assignStudentLeader(tom);
        klassOne.assignStudentLeader(paul);

        Assert.assertEquals("Tom", klassOne.getStudentLeader().getName());


    }
}
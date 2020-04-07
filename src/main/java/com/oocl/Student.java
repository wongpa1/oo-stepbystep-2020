package com.oocl;

public class Student extends Person {

    private String classnumber;

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old. I am a student of class %s.Coding for the glory of OOCL.",this.getName(),classnumber,this.getAge());
    }
}

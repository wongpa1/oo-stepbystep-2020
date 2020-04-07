package com.oocl;

public class Student extends Person {

    private String klassNumber;

    public String getKlassNumber() {
        return klassNumber;
    }

    public void setKlassNumber(String klassNumber) {
        this.klassNumber = klassNumber;
    }

    public String introduce(){

        if(klassNumber.isEmpty()){
            return String.format("My name is %s. I am %s years old. Coding for the glory of OOCL.",this.getName(),this.getAge());
        }
        return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.",this.getName(),this.getAge(),klassNumber);
    }
}

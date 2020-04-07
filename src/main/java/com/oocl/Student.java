package com.oocl;

public class Student extends Person {

    private String klassNumber = new String();

    public String getKlassNumber() {
        return klassNumber;
    }

    public void setKlassNumber(String klassNumber) {
        this.klassNumber = klassNumber;
    }

    public String introduce(){

        if(this.klassNumber.isEmpty()){
            return String.format("My name is %s. I am %s years old. Coding for the glory of OOCL.",this.getName(),this.getAge());
        }
        else
            return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.",this.getName(),this.getAge(),klassNumber);
    }

    public String studentWelcomeNewStudent(String klassnumber, Student student){
        return (this.introduce() + String.format(" Welcome %s join Class %s.",student.getName(),klassnumber));
    }

    public String studentWelcomeStudentLeader(String klassnumber, Student student){
        return (this.introduce() + String.format(" %s is the leader of Class %s.",student.getName(),klassnumber));
    }

}

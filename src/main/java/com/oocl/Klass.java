package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private String klassnumber;
    private List<Student> studentList = new ArrayList<Student>();
    private Student studentLeader;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Student getStudentLeader() {
        return studentLeader;
    }

    public String getKlassnumber() {
        return klassnumber;
    }

    public void setKlassnumber(String klassnumber) {
        this.klassnumber = klassnumber;
    }

    public void assignStudentToKlass(Student newStudent){
        if(newStudent.getKlassNumber().isEmpty()){
            newStudent.setKlassNumber(this.klassnumber);
            this.studentList.add(newStudent);
        }
    }

    public void assignStudentLeader(Student student){
        if(studentList.contains(student)){
            this.studentLeader = student;
        }
    }
}
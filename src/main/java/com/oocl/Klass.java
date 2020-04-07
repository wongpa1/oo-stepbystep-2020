package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private String klassnumber;
    private List<Student> studentList = new ArrayList<Student>();
    private Student studentLeader = new Student();
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

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

    public String assignStudentToKlass(Student newStudent){

        String Welcoming = new String();

        if(newStudent.getKlassNumber().isEmpty()){
            newStudent.setKlassNumber(this.klassnumber);
            this.studentList.add(newStudent);

            if (this.teacher != null) {
                Welcoming = this.teacher.welcomeNewStudent(this.klassnumber, newStudent);
            }
            if (!this.studentList.isEmpty()){
                for (int index = 0; index < this.studentList.size(); index++) {
                    if(this.studentList.get(index)!=newStudent) {
                        Welcoming += this.studentList.get(index).studentWelcomeNewStudent(this.klassnumber, newStudent);
                    }
                }
            }
            return Welcoming;
        }
        return null;
    }

    public String assignStudentLeader(Student student){

        String Welcoming = new String();

        if(studentList.contains(student)) {
            this.studentLeader = student;

            if (this.teacher != null) {
                Welcoming = this.teacher.welcomeStudentLeader(this.klassnumber, student);
            }
            if (!this.studentList.isEmpty()){
                for (int index = 0; index < this.studentList.size(); index++) {
                    if(this.studentList.get(index)!=student) {
                        Welcoming += this.studentList.get(index).studentWelcomeStudentLeader(this.klassnumber, student);
                    }
                }
            }
            return Welcoming;
        }
        return null;
    }

    public void assignTeacherToKlass(Teacher teacher){
        if(this.teacher != null){
            this.teacher.dropKlassnumber(this.klassnumber);
        }
        this.teacher = teacher;
        teacher.addKlassnumber(this.klassnumber);
    }
}

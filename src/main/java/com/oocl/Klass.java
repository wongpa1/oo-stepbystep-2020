package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private String klassNumber;
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

    public String getKlassNumber() {
        return klassNumber;
    }

    public void setKlassNumber(String klassNumber) {
        this.klassNumber = klassNumber;
    }

    public String assignStudentToKlass(Student newStudent) {

        StringBuilder welcoming = new StringBuilder();

        if (newStudent.getKlassNumber().isEmpty()) {
            newStudent.setKlassNumber(this.klassNumber);
            this.studentList.add(newStudent);

            if (this.teacher != null) {
                welcoming = new StringBuilder(this.teacher.welcomeNewStudent(this.klassNumber, newStudent));
            }
            if (!this.studentList.isEmpty()) {
                for (Student student : this.studentList) {
                    if (student != newStudent) {
                        welcoming.append(student.studentWelcomeNewStudent(this.klassNumber, newStudent));
                    }
                }
            }
            return welcoming.toString();
        }
        return null;
    }

    public String assignStudentLeader(Student student) {

        StringBuilder welcoming = new StringBuilder();

        if (studentList.contains(student)) {
            this.studentLeader = student;

            if (this.teacher != null) {
                welcoming = new StringBuilder(this.teacher.welcomeStudentLeader(this.klassNumber, student));
            }
            if (this.studentList.isEmpty()) {
                return welcoming.toString();
            }
            for (Student value : this.studentList) {
                if (value != student) {
                    welcoming.append(value.studentWelcomeStudentLeader(this.klassNumber, student));
                }
            }
            return welcoming.toString();
        }
        return null;
    }

    public void assignTeacherToKlass(Teacher teacher) {
        if (this.teacher != null) {
            this.teacher.dropKlassnumber(this.klassNumber);
        }
        this.teacher = teacher;
        teacher.addKlassnumber(this.klassNumber);
    }
}

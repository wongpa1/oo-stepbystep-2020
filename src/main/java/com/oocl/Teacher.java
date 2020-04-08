package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    public static final int LIMITEDKLASS = 5;
    private List<String> klassList = new ArrayList<String>();

    public List<String> getKlassList() {
        return klassList;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.", this.getName(), this.getAge());
    }

    public void addKlassnumber(String klassnumber) {
        if (this.klassList.size() < LIMITEDKLASS && !this.klassList.contains(klassnumber)) {
            this.klassList.add(klassnumber);
        }
    }

    public void dropKlassnumber(String klassnumber) {
        if (this.klassList.size() > 0) {
            this.klassList.remove(klassnumber);
        }
    }

    public String welcomeNewStudent(String klassnumber, Student student) {
        return (this.introduce() + String.format(" Welcome %s join Class %s.", student.getName(), klassnumber));
    }

    public String welcomeStudentLeader(String klassnumber, Student student) {
        return (this.introduce() + String.format(" %s is the leader of Class %s.", student.getName(), klassnumber));
    }
}

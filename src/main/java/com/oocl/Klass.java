package com.oocl;

public class Klass {
    private String klassnumber;

    public String getKlassnumber() {
        return klassnumber;
    }

    public void setKlassnumber(String klassnumber) {
        this.klassnumber = klassnumber;
    }

    public void assignStudentToKlass(Student newStudent){
        if(newStudent.getKlassNumber().isEmpty()){
            newStudent.setKlassNumber(this.klassnumber);
        }
    }
}

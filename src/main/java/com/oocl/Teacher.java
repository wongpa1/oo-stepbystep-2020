package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<String> klassList = new ArrayList<String>();

    public List<String> getKlassList() {
        return klassList;
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.",this.getName(),this.getAge());
    }

    public void addKlassnumber(String klassnumber){
        if(this.klassList.size()<5 && !this.klassList.contains(klassnumber)){
            this.klassList.add(klassnumber);
        }
    }

    public void dropKlassnumber(String klassnumber){
        if(this.klassList.size()>0 && this.klassList.contains(klassnumber)){
            this.klassList.remove(klassnumber);
        }
    }
}

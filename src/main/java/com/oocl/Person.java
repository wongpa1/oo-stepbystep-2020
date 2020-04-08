package com.oocl;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String newAge) {
        this.age = newAge;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }
}

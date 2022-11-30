package com.waqas.demo;

// Access modifiers: private, public, protected and default
public class Employee {
    public int age1;

    //Default access modifier
    int age2;

    private int age3;

    public void setAge(int age3) {
        if (age3 <= 0) {
            throw new IllegalArgumentException("Age cannot be less than 1");
        }
        this.age3 = age3;
    }

    public int getAge() {
        return age3;
    }

}

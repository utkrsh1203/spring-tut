package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer com;


    public Alien() {
//        System.out.println("Object Created");
    }

//    public Alien(int age){
//        System.out.println("Para constructor called");
//        this.age = age;
//    }

    @ConstructorProperties({"age", "com"})
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
//        System.out.println("Setter called");
        this.com = com;
    }

    public void code(){
        System.out.println("Coding..");
        com.compile();
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("20")
    private int age;
    @Autowired // Field/Constructor/Setter injection : Either of them can be used to create an object for computer
    private Computer com;
//    @Qualifier("com1") // Specify the name of the bean, if name is not defined : Use class name with all small letters
//    If there is primary bean, and qualifier is also mentioned : Preference will be given to the qualifier


    public Alien() {
        System.out.println("Alien Object Created");
    }

//    public Alien(int age){
//        System.out.println("Para constructor called");
//        this.age = age;
//    }

//    @Autowired
//    public Alien(Computer com) {
//        this.com = com;
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
//    @Autowired
    public void setCom(Computer com) {
//        System.out.println("Setter called");
        this.com = com;
    }

    public void code(){
        System.out.println("Coding..");
        com.compile();
    }
}

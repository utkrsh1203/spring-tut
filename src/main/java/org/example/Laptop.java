package org.example;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com1") //Specify name of the bean
@Primary
public class Laptop implements Computer {
    public Laptop() {

        System.out.println("Laptop object created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling on laptop..");
    }
}
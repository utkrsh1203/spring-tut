package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

////    @Bean(name = {"com2", "desktop"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//
//        return new Laptop();
//    }
//
//
//    @Bean
////    public Alien alien(@Autowired Computer com){ // using Autowired annotation is optional here
//    public Alien alien( Computer com){ //@Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(20);
////        obj.setCom(desktop());
//
//        obj.setCom(com); //It will search for com object in the container
//
//        return obj;
//    }
//




}

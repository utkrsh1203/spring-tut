package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // create a container along with all the objects that are present in bean config

//        If we change the scope of bean to prototype, then object won't be created with container. Seperate objects will be created when getBean is called.

        // beans are basically objects managed by spring framework
//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.setAge(20);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien2");
//        System.out.println(obj2.getAge());




//        Avioid explicit type conversion from getBean
//        getBean returns an Object, but we want of type Alien

//        Alien obj1 = context.getBean("alien",Alien.class); // Search by type will be called if name is not specified
//        System.out.println(obj1.getAge());


// Since computer is an interface, it will search for all the beans that implements computer class, and since name is not mentioned search byType will be used
// If multiple beans are found with no primary bean, it will show an error
//        Computer com = context.getBean(Computer.class);



    }
}

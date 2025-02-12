package com.in28minutes.learnspringframework.examples.example9.main;

import com.in28minutes.learnspringframework.examples.example9.Beans.Person;
import com.in28minutes.learnspringframework.examples.example9.Beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learnspringframework.examples.example9.config.ProjectConfig;


public class Example9 {

    public static void main(String[] args)
    {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
     System.out.println("Before retriving the bean Person from Spring");
     Person obj = context.getBean(Person.class);
     System.out.println("After retriving the bean Person from Spring");
}
}
package com.in28minutes.learnspringframework.examples.example12.main;

import com.in28minutes.learnspringframework.examples.example12.Beans.Person;
import com.in28minutes.learnspringframework.examples.example12.Beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learnspringframework.examples.example12.config.ProjectConfig;


public class Example12 {

    public static void main(String[] args)
    {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Person person = context.getBean(Person.class);
    System.out.println("Person name from Spring container: "+ person.getName());
    System.out.println("Vehicle owned by person from Spring container: "+person.getVehicle());

}
}
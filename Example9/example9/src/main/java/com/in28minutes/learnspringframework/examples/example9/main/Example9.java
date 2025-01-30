package com.in28minutes.learnspringframework.examples.example9.main;

import com.in28minutes.learnspringframework.examples.example9.Beans.Person;
import com.in28minutes.learnspringframework.examples.example9.Beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learnspringframework.examples.example9.config.ProjectConfig;


public class Example9 {

    public static void main(String[] args)
    {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Person person = context.getBean(Person.class);
    Vehicle vehicle = context.getBean(Vehicle.class);
    System.out.println("Person name from Spring container: "+ person.getName());
    System.out.println("Vehicle name from Spring container: "+vehicle.getName());
    System.out.println("Vehicle owned by person from Spring container: "+person.getVehicle());

}
}
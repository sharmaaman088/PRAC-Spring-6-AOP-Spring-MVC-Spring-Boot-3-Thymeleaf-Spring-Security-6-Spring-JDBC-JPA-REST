package com.in28minutes.learnspringframework.examples.example14.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.in28minutes.learnspringframework.examples.example14.Implementation",
"com.in28minutes.learnspringframework.examples.example14.Services"})
@ComponentScan(basePackageClasses = {com.in28minutes.learnspringframework.examples.example14.Beans.Vehicle.class,
com.in28minutes.learnspringframework.examples.example14.Beans.Person.class})
public class ProjectConfig {


   

   

}

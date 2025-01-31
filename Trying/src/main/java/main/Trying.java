package main;

import Bean.Computer;
import Bean.Processor;
import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Trying {
    public static void main(String[] args) {



    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Computer computer = context.getBean(Computer.class);
    Processor processor =context.getBean(Processor.class);
    System.out.println("Name of Processor is " + processor.getProcessorName() );
    System.out.println("Name of Computer bought you by Spring is: " + computer.getComputerName());
}
}
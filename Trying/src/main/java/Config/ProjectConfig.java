package Config;

import Bean.Processor;
import Bean.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ProjectConfig {



@Bean
    public Computer obj(){
        Computer obj = new Computer();
        obj.setComputerName("HP");
        return obj;
    }
    @Bean
    public Processor object(){
        Processor object = new Processor();
        object.setProcessorName("Intel");
        return object;

    }

}

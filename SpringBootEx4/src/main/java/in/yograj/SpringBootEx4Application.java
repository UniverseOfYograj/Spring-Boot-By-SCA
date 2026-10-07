package in.yograj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootEx4Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringBootEx4Application.class, args);

        System.out.println("Class: "+container.getClass().getName());
    }

}

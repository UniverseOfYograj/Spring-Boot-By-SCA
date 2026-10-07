package in.yograj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootEx5Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringBootEx5Application.class, args);
        System.out.println(container.getClass().getName());
    }

}

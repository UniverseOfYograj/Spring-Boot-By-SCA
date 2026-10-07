package in.yograj;

import in.yograj.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEx3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEx3Application.class, args);
    }

    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

}

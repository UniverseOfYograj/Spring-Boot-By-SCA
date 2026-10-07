package in.yograj.config;

import in.yograj.Service.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public EmailService emailService(){
        return new EmailService();
    }
}

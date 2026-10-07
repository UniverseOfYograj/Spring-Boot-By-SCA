package in.yograj.app;

import in.yograj.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    void main() {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("======");
        Programmer p = container.getBean(Programmer.class);
        System.out.println("Programmer's name is:" +p.getName());
        System.out.println("Programmer's laptop is:"+p.getLaptop());
    }
}

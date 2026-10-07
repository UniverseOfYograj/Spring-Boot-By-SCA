package in.yograj.app;

import in.yograj.beans.Laptop;
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
        Laptop lp=container.getBean(Laptop.class);
        System.out.println(lp==p.getLaptop());
        System.out.println(lp.hashCode()==p.getLaptop().hashCode());
        System.out.println(p.getLaptop().hashCode());
        System.out.println(lp.hashCode());
    }
}

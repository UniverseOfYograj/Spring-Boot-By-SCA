package in.yograj.app;

import in.yograj.beans.Desktop;
import in.yograj.beans.Laptop;
import in.yograj.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    void main() {
        System.out.println("Inner Bean Concept");
        ApplicationContext container = new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("======");
        Laptop lpObj=container.getBean(Laptop.class);
        System.out.println("Laptop's brand is="+lpObj.getBrand());

        Desktop desk=(Desktop) container.getBean("d");
        System.out.println("Desktop's brand is="+ desk.getBrand());

        Programmer programmer=(Programmer) container.getBean("pObj");// No UniqueBeanDefinitionException
        System.out.println("Programmer's name is="+programmer.getName());
        System.out.println("Programmer's Computer is="+programmer.getComputer());
        System.out.println("=======>");
        System.out.println("Second Programmer ===>");
        Programmer p= (Programmer) container.getBean("p1");
        System.out.println("Programmer's name is="+p.getName());
        System.out.println("Programmer's Computer is="+p.getComputer());

        System.out.println("=======>");
        System.out.println("Third Programmer ===>");
        Programmer pr= (Programmer) container.getBean("p3");
        System.out.println("Programmer's name is="+pr.getName());
        System.out.println("Programmer's Computer is="+pr.getComputer());

    }
}

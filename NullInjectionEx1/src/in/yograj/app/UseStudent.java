package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");

        System.out.println("=======");
        Student s=container.getBean("s1",Student.class);
        s.display();

        Student s1=container.getBean("s2",Student.class);
        s1.display();
    }
}

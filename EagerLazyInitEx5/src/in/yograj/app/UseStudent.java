package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class UseStudent {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("Container Started!");
        Student s=  container.getBean(Student.class);

        System.out.println("Name of Student="+s.getName());
        System.out.println("Roll No of Student="+s.getRollno());
    }
}

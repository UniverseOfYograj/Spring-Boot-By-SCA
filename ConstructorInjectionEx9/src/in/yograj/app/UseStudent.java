package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("=====");
        Student s1=container.getBean("s1",Student.class);
        System.out.println("Student's rollNo is="+s1.getRollno());
        System.out.println("Student's Name is="+s1.getName());
        System.out.println("Student's Address is="+s1.getAddress());


        Student s2=container.getBean("s2",Student.class);
        System.out.println("Student's rollNo is="+s2.getRollno());
        System.out.println("Student's Name is="+s2.getName());
        System.out.println("Student's Address is="+s2.getAddress());
    }
}

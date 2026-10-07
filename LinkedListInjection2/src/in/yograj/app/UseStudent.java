package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UseStudent {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("=======");
        Student s=container.getBean("st", Student.class);
        System.out.println("Name of the student is="+s.getName());
        System.out.println("id of the Student is="+s.getId());

        System.out.println("Subjects of the Student:"+s.getName()+" are="+s.getSubjects());
        System.out.println("Marks of the Student:"+s.getName()+" are="+s.getMarks());
    }
}

package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
     void main() {
         ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
         System.out.println("================");
         System.out.println("calling Bean");
         Student obj=container.getBean(Student.class);
         System.out.println(obj.getName());
         System.out.println(obj.getRollno());


    }
}

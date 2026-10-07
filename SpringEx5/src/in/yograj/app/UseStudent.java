package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
     void main() {
         ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
         System.out.println("================");
         System.out.println("Calling Beans");
         Student obj=(Student)container.getBean("s5");
         System.out.println(obj.getName());
         System.out.println(obj.getRollno());

         Student ob=(Student)container.getBean("stObj");
         System.out.println(ob.getName());
         System.out.println(ob.getRollno());


     }
}

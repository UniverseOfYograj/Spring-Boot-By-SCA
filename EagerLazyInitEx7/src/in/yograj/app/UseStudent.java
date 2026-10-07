package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class UseStudent {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("==============>");
        System.out.println("Container Started!");
        System.out.println("<==================");
        Student s=  container.getBean(Student.class);
        System.out.println("<===Calling s reference properties===>");

        System.out.println("Name of Student="+s.getName());
        System.out.println("Roll No of Student="+s.getRollno());

        Student s1=container.getBean(Student.class);
        System.out.println("<===Calling s1 reference properties===>");

        System.out.println("Name of Student="+s1.getName());
        System.out.println("Roll No of Student="+s1.getRollno());
        System.out.println("<====Checking if S & S1 are equal=====>");
        System.out.println(s.equals(s1));
        System.out.println("S's reference="+s.hashCode());
        System.out.println("S1's reference="+s1.hashCode());

        System.out.println(s1.equals(null));

    }
}

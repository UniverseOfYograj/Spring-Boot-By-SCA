package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class UseStudent {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");

        Student s=  container.getBean(Student.class);
        System.out.println("================");

        System.out.println("Printing S's Properties!");
        System.out.println("roll no of S:"+s.getName());
        System.out.println("name of S:"+s.getRollno());

        Student s1=container.getBean(Student.class);
        System.out.println("Printing S1's Properties!");
        System.out.println("<========>");
        System.out.println("roll no of s1:"+s1.getName());
        System.out.println("name of s1:"+s1.getRollno());
        System.out.println("===============");

        System.out.println("Are s1 and s equal or not?"+(s1==s));
        System.out.println("S1's hashcode:"+s1.hashCode());
        System.out.println("S's hashcode:"+s.hashCode());
        System.out.println(s1.equals(s));

        s.setName("Sachin");
        s.setRollno(102);
        System.out.println("After changing s reference's properties");

        System.out.println("Printing S's Properties!");
        System.out.println("roll no of S:"+s.getName());
        System.out.println("name of S:"+s.getRollno());
        System.out.println("<=======>");
        System.out.println("Printing S1's Properties!");
        System.out.println("<================>");
        System.out.println("roll no of s1:"+s1.getName());
        System.out.println("name of s1:"+s1.getRollno());
        System.out.println("<===============>");
        System.out.println("Are s1 and s equal or not?"+(s1==s));
        System.out.println("S1's hashcode:"+s1.hashCode());
        System.out.println("S's hashcode:"+s.hashCode());
        System.out.println(s1.equals(s));

    }
}

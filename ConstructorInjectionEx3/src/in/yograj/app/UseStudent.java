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
        System.out.println("=======");

        Student s=  container.getBean("s1",Student.class);

        System.out.println("Name of Student="+s.getName());
        System.out.println("Roll No of Student="+s.getRollno());

        Student s1=  container.getBean("s2",Student.class);

        System.out.println("Name of Student="+s1.getName());
        System.out.println("Roll No of Student="+s1.getRollno());


        Student s2=  container.getBean("s3",Student.class);
        System.out.println("Name of Student="+s2.getName());
        System.out.println("Roll No of Student="+s2.getRollno());

        Student s3=  container.getBean("s4",Student.class);
        System.out.println("Name of Student="+s3.getName());
        System.out.println("Roll No of Student="+s3.getRollno());
    }
}

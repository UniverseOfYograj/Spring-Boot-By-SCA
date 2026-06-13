package in.yograj.app;

import in.yograj.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class UseStudent {
    static void main() {
        Resource res=new ClassPathResource("/in/yograj/resources/beanconfiguration.xml");
        BeanFactory container=new XmlBeanFactory(res);

        Student s=  container.getBean(Student.class);

        System.out.println("Name of Student="+s.getName());
        System.out.println("Roll No of Student="+s.getRollno());
    }
}

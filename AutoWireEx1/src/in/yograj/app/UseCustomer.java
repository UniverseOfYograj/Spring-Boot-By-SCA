package in.yograj.app;

import in.yograj.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class UseCustomer {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");

        Customer s= (Customer) container.getBean("s3");

        System.out.println("Name of Student="+s.getName());
        System.out.println("Roll No of Student="+s.getRollno());
        System.out.println("Roll No of Student="+s.getAccount());




    }
}

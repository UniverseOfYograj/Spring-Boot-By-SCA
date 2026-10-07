package in.yograj.app;

import in.yograj.beans.Company;
import in.yograj.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCompany {
     void main() {
         ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
         Company company=container.getBean(Company.class);

         System.out.println("=======");
         System.out.println("Company name is="+company.getCompName());
         System.out.println("Company Employees are="+company.getWorkers());
         Employee []workers=company.getWorkers();
         System.out.println("Printing the details of the workers==>");
         for(Employee e:workers) System.out.println(e);
    }
}

package in.yograj.app;

import in.yograj.beans.Company;
import in.yograj.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UseCompany {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        System.out.println("======");
        Company c=container.getBean(Company.class);

        System.out.println("Company's name is="+c.getCompName());
        System.out.println("Employees of the company are="+c.getEmployees());

    }
}

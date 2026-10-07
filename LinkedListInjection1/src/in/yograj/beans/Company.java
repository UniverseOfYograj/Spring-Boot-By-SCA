package in.yograj.beans;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private String compName;
    private LinkedList<Employee>employees;

    Company(){
        System.out.println("Company bean Created!");
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(LinkedList<Employee> employees) {
        this.employees = employees;
    }
}

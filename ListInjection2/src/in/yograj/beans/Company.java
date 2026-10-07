package in.yograj.beans;

import java.util.List;

public class Company {
    private String compName;
    private List<Employee>employees;

    Company(){
        System.out.println("Company bean Created!");
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

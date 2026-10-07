package in.yograj.beans;

public class Employee {
    private int empId;
    private String empName;

    public Employee(){
        System.out.println("Employee bean created!");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String toString(){
        return this.getEmpId()+this.getEmpName();
    }
}

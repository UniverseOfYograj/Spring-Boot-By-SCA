package in.yograj.beans;

public class Employee {
    private int empId;
    private String empName;

    Employee(){
        System.out.println("Employee bean created!");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
        System.out.println("Setter for Employee Id called!");
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
        System.out.println("Setter for Employee name called!");
    }

    public String toString(){
        return this.getEmpId()+" "+this.getEmpName();
    }
}

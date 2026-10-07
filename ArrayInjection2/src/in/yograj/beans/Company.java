package in.yograj.beans;

public class Company {
    private String compName;
    private Employee []workers;

    public Company(){
        System.out.println("Company bean created!");
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
        System.out.println("Setter for company name called!");
    }

    public Employee[] getWorkers() {
        return workers;
    }

    public void setWorkers(Employee[] workers) {
        this.workers = workers;
        System.out.println("Setter for worker array called!");
    }
}

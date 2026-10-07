package in.yograj.beans;

public class Customer {
    String name;
    int rollno;
    private Account account;

    public Customer(){
        super();
        System.out.println("Student Bean created! Using Constructor!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter for name called!");
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        System.out.println("Setter for rollno called!");
        this.rollno = rollno;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
        System.out.println("Setter for account called!");
    }
}

package in.yograj.beans;

public class Student {
    String name;
    int rollno;
    private Address address;

    public Student(){
        super();
        System.out.println("Student Bean created! Using Constructor!!");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
}

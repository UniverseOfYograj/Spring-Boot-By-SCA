package in.yograj.beans;

public class Student {
    private int rollno;
    private String name;
    private Address address;


    public Student(String name){
        this.name=name;
        System.out.println("Student bean initialized using String Constructor!");
    }
    public Student(int rollno,String name,Address address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
        System.out.println("Student Bean Created using int-str-address!");
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString(){
        return this.rollno+","+this.rollno+","+this.address;
    }
}

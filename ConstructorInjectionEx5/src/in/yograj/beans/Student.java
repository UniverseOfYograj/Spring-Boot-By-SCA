package in.yograj.beans;

public class Student {
    private String name;
    private int rollno;

    public Student(String name, int rollno){
        super();
        this.name=name;
        this.rollno=rollno;
        System.out.println("Student Bean created! Using Parameterized (int & String) Constructor!!");
    }

    public Student(String name, String rollno){
        super();
        this.name=name;
        System.out.println("Student Bean created! Using Parameterized(String & String) Constructor!!");
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

    public String toString(){
        return this.name+this.rollno;
    }
}

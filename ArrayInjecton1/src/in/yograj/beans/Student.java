package in.yograj.beans;

public class Student {
    private String name;
    private int rollno;
    private String []subjects;


    public Student(){
        super();
        System.out.println("Student Bean created! Using Constructor!!");
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        System.out.println("Setter called for subjects:"+subjects.length);
        this.subjects = subjects;
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

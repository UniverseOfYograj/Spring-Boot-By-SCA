package in.yograj.beans;

import java.util.Date;

public class Student {
    private int rollno;
    private String name;
    private Date dobDate;

    public Student(int rollno,String name, Date dobDate){
        this.rollno=rollno;
        this.name=name;
        this.dobDate=dobDate;
        System.out.println("Student Bean created using parameterized constructor!");
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

    public Date getDobDate() {
        return dobDate;
    }

    public void setDobDate(Date dobDate) {
        this.dobDate = dobDate;
    }

    public void display(){
        System.out.println("Student's rollno:"+rollno);
        System.out.println("Student's name:"+name);
        System.out.println("Student's dob:"+dobDate);
    }
}

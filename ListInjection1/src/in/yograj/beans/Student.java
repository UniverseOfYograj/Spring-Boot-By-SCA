package in.yograj.beans;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<String> subjects;
    private List<Integer>marks;

    public Student(){
        System.out.println("Student Bean Created!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter for name called!");
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
        System.out.println("Setter for subjects called!");
        System.out.println("Subjects passed as+"+subjects.getClass());
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
        System.out.println("Setter for marks called!");
        System.out.println("Marks passed or stored as+"+marks.getClass());

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package in.yograj.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private int id;
    @Column(name = "stu_name", nullable = false)
    private String name;

    public Student(){
        System.out.println("Student bean created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

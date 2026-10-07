package in.yograj.service;

import in.yograj.model.Student;
import in.yograj.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        System.out.println("Student Service Bean Created!!");
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void getCount() {
        System.out.println("Total number of Students is:" + studentRepository.count());
    }

    public void findById(int roll) {
        Student student = studentRepository.findById(roll);
        System.out.println("Record Found for:" + roll + " = " + student);
    }

    public void findAll() {
        List<Student> studentList = studentRepository.findAll();
        if (studentList != null) {
            studentList.forEach(System.out::println);
        } else {
            System.out.println("Table Student is empty");
        }
    }

    public void deleteStudent(int roll) {
        System.out.println(studentRepository.remove(roll));
    }

}

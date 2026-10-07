package in.yograj.service;

import in.yograj.model.Student;
import in.yograj.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public int getCount(){
        int count=  studentRepository.Count();
        return count;
    }

    public String findById(int roll){
        String name=studentRepository.findById(roll);
        return name;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}

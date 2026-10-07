package in.yograj.service;

import in.yograj.dto.Student;
import in.yograj.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student findById(int id){
       Optional<Student>opt= studentRepository.findById(id);
       if(opt.isPresent()){
           Student s=opt.get();
           return s;
       }else{
           System.out.println("No Student with Id: "+id+" Found!!");
           return null;
       }
    }

    public String deleteById(int id){

        Optional<Student>opt =studentRepository.findById(id);
        if(opt.isEmpty()){
            return "No Student found with Id:"+id+" in DataBase";
        }else{
            Student student=opt.get();
            studentRepository.deleteById(id);
            return student.getName()+" with Id: "+id+" deleted successfully!";
        }
    }

    public Iterable<Student> findAll(){
      Iterable<Student>studentList= studentRepository.findAll();
        return studentList;
    }



}

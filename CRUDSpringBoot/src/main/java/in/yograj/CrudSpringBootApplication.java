package in.yograj;

import in.yograj.dto.Student;
import in.yograj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrudSpringBootApplication {

    private static StudentService studentService;
    @Autowired
    public CrudSpringBootApplication(StudentService studentService){
        this.studentService=studentService;
    }

    public static void main(String[] args) {





        ConfigurableApplicationContext container = SpringApplication.run(CrudSpringBootApplication.class, args);

        Student student=new Student();
        student.setName("Shyam");
        studentService.save(student);
      /* Student s= studentService.findById(1);
        System.out.println("Student Found: "+s); */

        Student s1=studentService.findById(101);
        System.out.println(s1);

        String msg=studentService.deleteById(4);
        System.out.println(msg);

        Iterable<Student>studentIterable=studentService.findAll();
        for(Student s:studentIterable){
            System.out.println(s);
        }
//        studentService.deleteById(101);







    }

}

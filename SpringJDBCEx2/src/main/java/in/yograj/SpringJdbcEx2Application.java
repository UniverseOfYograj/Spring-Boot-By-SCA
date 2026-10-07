package in.yograj;

import in.yograj.model.Student;
import in.yograj.repository.StudentRepository;
import in.yograj.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcEx2Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext container=SpringApplication.run(SpringJdbcEx2Application.class, args);
        System.out.println("============>");
        System.out.println(container.getClass().getName());
        System.out.println("=============>");
        Scanner kb=new Scanner(System.in);
        String choice;


        StudentService studentService=container.getBean(StudentService.class);
        do{
            int roll=kb.nextInt();
            String name=kb.next();
            double percentage=kb.nextDouble();

            Student student=container.getBean(Student.class);

            student.setRoll(roll);
            student.setName(name);
            student.setPercent(percentage);

            studentService.addStudent(student);

            System.out.println("Wanna Add more Students? Type Yes or No!");
            choice=kb.next();
        }while(choice.equalsIgnoreCase("yes"));

        List<Student> list=studentService.findAll();
        System.out.println(list);
        list.forEach(n-> System.out.println(n));




    }

}

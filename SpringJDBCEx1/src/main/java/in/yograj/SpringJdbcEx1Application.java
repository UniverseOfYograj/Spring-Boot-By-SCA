package in.yograj;

import in.yograj.model.Student;
import in.yograj.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container=SpringApplication.run(SpringJdbcEx1Application.class, args);

        Scanner kb=new Scanner(System.in);

        System.out.println("Enter Roll:");
        int roll=kb.nextInt();

        System.out.println("Enter Name:");
        String name=kb.next();

        System.out.println("Enter percentage:");
        double percentage=kb.nextDouble();

        Student student=container.getBean(Student.class);
        StudentService studentService=container.getBean(StudentService.class);

        student.setRoll(roll);
        student.setName(name);
        student.setPercent(percentage);

        studentService.addStudent(student);
        System.out.println("The count of total Students is:"+studentService.getCount());

        System.out.println("Name with roll:"+roll+" is:"+studentService.findById(roll));
    }


}

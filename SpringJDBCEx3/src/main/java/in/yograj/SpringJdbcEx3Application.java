package in.yograj;

import in.yograj.model.Student;
import in.yograj.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcEx3Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcEx3Application.class, args);
        System.out.println("============>");
        System.out.println(container.getClass().getName());
        System.out.println("=============>");

        Scanner kb = new Scanner(System.in);
        String choice;

        StudentService studentService = container.getBean(StudentService.class);
        Student student = container.getBean(Student.class);
        do {
            int roll = kb.nextInt();
            String name = kb.next();
            double percentage = kb.nextDouble();

            student.setRoll(roll);
            student.setName(name);
            student.setPercentage(percentage);

            studentService.addStudent(student);
            System.out.println("Wanna Enter more Student Data/Record type yes or no!");
            choice = kb.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("<==Deleting Student with id 91!==>");

        studentService.deleteStudent(91);
        System.out.println("<==Finding all records present int the table!==>");
        studentService.findAll();
        System.out.println("<==Total count of Students in the Table!==>");
        studentService.getCount();
        System.out.println("<==Trying to find the record or roll number 90==>");
        studentService.findById(90);


    }

}

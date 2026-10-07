package in.yograj.repository;

import in.yograj.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    JdbcTemplate jdbcTemplate;

    @Autowired
    StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("Student Repository Bean Created!");
    }

    public int save(Student student) {
        String sql = "insert into students (roll,name,percentage) values (?,?,?)";
        int count = jdbcTemplate.update(sql, student.getRoll(), student.getName(), student.getPercentage());
        System.out.println("Record Inserted:" + count);
        return count;
    }

    public Student findById(int roll) {
        String sql = "select * from students where roll=?";
        Student student = new Student();
        try {
            return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
                student.setRoll(rs.getInt("roll"));
                student.setName(rs.getString("name"));
                student.setPercentage(rs.getDouble("percentage"));
                return student;
            }, roll);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("Student Object not found!");
            return null;
        }

    }

    public int count() {

        String sql = "select count(*) from students ";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public List<Student> findAll() {
        List<Student> studentList;
        String sql = "Select * from students";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
                    Student student = new Student();
                    student.setRoll(rs.getInt("roll"));
                    student.setName(rs.getString("name"));
                    student.setPercentage(rs.getDouble("percentage"));
                    return student;
                }
        );
    }

    public String remove(int roll) {
        String sql = "delete from students where roll=?";
        int isDeleted = jdbcTemplate.update(sql, roll);

        return (isDeleted == 1) ?
                "Student with Id:" + roll + " Deleted SuccessFully!"
                :
                "Student Record is not deleted!";
    }

    public List<Student> findAllStudents(){
        String sql="select * from students";
        List<Student>studentList=jdbcTemplate.query(sql,new StudentRowMapper());
        return studentList;
    }
}

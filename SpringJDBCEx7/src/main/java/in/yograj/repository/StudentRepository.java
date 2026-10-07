package in.yograj.repository;

import in.yograj.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;import org.springframework.stereotype.Repository;

import java.util.HashMap;import java.util.List;import java.util.Map;

@Repository
public class StudentRepository {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    StudentRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        System.out.println("Student Repository Bean Created!");
    }

    public int save(Student student) {
        String sql = "insert into students (roll,name,percentage) values (:roll,:name,:percentage)";

        Map<String,Object> map=new HashMap<>();
        map.put("roll",student.getRoll());
        map.put("name",student.getName());
        map.put("percentage",student.getPercentage());
        int count = namedParameterJdbcTemplate.update(sql, map);
        System.out.println("Record Inserted:" + count);
        return count;
    }

    public String findbyId(int roll){
        String sql="Select name from students where roll=(:roll)";
        String name="";
        Map<String,Object>map=new HashMap<>();
        map.put("roll",roll);
        try{
          name=namedParameterJdbcTemplate.queryForObject(sql,map,String.class);}
        catch(EmptyResultDataAccessException ex){
            name=null;
            System.out.println("Exception Occured! No such name found!!");
        }
        finally{
        return name;
        }
    }

    public int count(){
        String sql="select count(*) from studentS";
     //   return namedParameterJdbcTemplate.queryForObject(sql,new HashMap<>(),Integer.class);
    return namedParameterJdbcTemplate.getJdbcOperations().queryForObject(sql,Integer.class);
    }

    /*public Student findById(int roll) {
        String sql = "select * from students where roll=?";
        Student student = new Student();
        try {
            return namedParameterJdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
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
        return namedParameterJdbcTemplate.queryForObject(sql, Integer.class);
    }

    public List<Student> findAll() {
        List<Student> studentList;
        String sql = "Select * from students";
        return namedParameterJdbcTemplate.query(sql, (rs, rowNum) -> {
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
        int isDeleted = namedParameterJdbcTemplate.update(sql, roll);

        return (isDeleted == 1) ?
                "Student with Id:" + roll + " Deleted SuccessFully!"
                :
                "Student Record is not deleted!";
    }

    public List<Student> findAllStudents(){
        String sql="select * from students";
        List<Student>studentList=namedParameterJdbcTemplate.query(sql,new BeanPropertyRowMapper<Student>(Student.class));
        return studentList;
    }*/
}

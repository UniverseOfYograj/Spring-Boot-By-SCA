package in.yograj.repository;


import in.yograj.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public void save(Student student){
        String sql="Insert into STUDENTS values(?,?,?)";
        int count=jdbcTemplate.update(sql,student.getRoll(),student.getName(),student.getPercent());
        System.out.println("Record Inserted:"+count);
    }

    public int Count(){
        String sql="SELECT COUNT(*) FROM STUDENTS";
        int count=jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    public String findById(int roll){
        String sql="Select name from STUDENTS where roll =?";
        String name="";
              try{
                  name=jdbcTemplate.queryForObject(sql, String.class,roll);
              } catch (EmptyResultDataAccessException e) {
                  name=null;
              }finally {
                  return name;
              }
    }
}

package in.yograj.repository;


import in.yograj.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setRoll(rs.getInt("roll"));
        student.setName(rs.getString("name"));
        student.setPercentage(rs.getDouble("percentage"));
        return student;
    }
}

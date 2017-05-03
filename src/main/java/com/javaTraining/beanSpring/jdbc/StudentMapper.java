package com.javaTraining.beanSpring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.javaTraining.beanSpring.jdbc.model.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
  public Student mapRow(ResultSet resultSet, int i) throws SQLException {

    return new Student(
        resultSet.getInt("id"),
        resultSet.getInt("age"),
        resultSet.getString("name"));
  }
}

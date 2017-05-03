package com.javaTraining.beanSpring.jdbc.dao;

import java.util.List;
import javax.sql.DataSource;
import com.javaTraining.beanSpring.jdbc.model.Student;

public interface StudentDao {
  void setDataSource(DataSource dataSource);

  void add(String name, Integer age);

  Student get(Integer id);

  List<Student> list();

  void delete(Integer id);

  void update(Integer id, Integer age);

}

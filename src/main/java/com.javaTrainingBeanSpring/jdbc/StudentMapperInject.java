package com.javaTrainingBeanSpring.jdbc;

import java.util.List;
import com.javaTrainingBeanSpring.jdbc.dao.StudentDao;
import com.javaTrainingBeanSpring.jdbc.model.Student;

public class StudentMapperInject {

  private StudentDao studentDao;

  public StudentMapperInject(StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  public void add(String name, Integer age) {
    studentDao.add(name, age);
  }

  public List<Student> list() {
    return studentDao.list();
  }
}

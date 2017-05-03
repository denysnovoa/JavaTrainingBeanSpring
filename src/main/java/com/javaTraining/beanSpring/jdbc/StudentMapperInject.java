package com.javaTraining.beanSpring.jdbc;

import com.javaTraining.beanSpring.jdbc.dao.StudentDao;
import java.util.List;
import com.javaTraining.beanSpring.jdbc.model.Student;

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

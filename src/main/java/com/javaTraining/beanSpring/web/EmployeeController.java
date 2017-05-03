package com.javaTraining.beanSpring.web;

import com.javaTraining.beanSpring.jdbc.dao.StudentDao;
import com.javaTraining.beanSpring.jdbc.model.Student;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

  private StudentDao studentDao;

  @RequestMapping("/students")
  @ResponseBody
  public String getStudents() {

    List<Student> students = studentDao.list();

    StringBuilder stringBuilder = new StringBuilder();

    for (Student student : students) {
      stringBuilder.append(student.toString());
    }

    return stringBuilder.toString();
  }
}

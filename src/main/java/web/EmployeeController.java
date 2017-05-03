package web;

import java.util.List;
import jdbc.dao.StudentDao;
import jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

  @Qualifier("StudentJDBCTemplate")
  @Autowired
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

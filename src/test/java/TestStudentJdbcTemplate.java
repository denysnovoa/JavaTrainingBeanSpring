import java.util.List;
import jdbc.StudentMapperInject;
import jdbc.model.Student;
import jdbc.template.StudentJdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentJdbcTemplate {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");

    StudentJdbcTemplate studentJdbcTemplate = (StudentJdbcTemplate) context.getBean("StudentJDBCTemplate");

    studentJdbcTemplate.add("pepe", 11);
    studentJdbcTemplate.add("juana", 32);
    studentJdbcTemplate.add("pablo", 34);


    StudentMapperInject studentMapperInject = (StudentMapperInject) context.getBean("StudentMapperInject");

    List<Student> students = studentMapperInject.list();
    for (Student student : students) {
      student.print();
    }

  }

}

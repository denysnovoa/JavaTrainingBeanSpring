package jdbc.template;

import java.util.List;
import javax.sql.DataSource;
import jdbc.StudentMapper;
import jdbc.dao.StudentDao;
import jdbc.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcTemplate implements StudentDao {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public void add(String name, Integer age) {
    String sql = "Insert into student (name, age ) values (?,?)";

    jdbcTemplate.update(sql, name, age);

    System.out.printf("Insert into student, name= %s age = %d%n", name, age);
  }

  public Student get(Integer id) {
    String sql = "Select * from student where id  = ?";
    Student student = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());

    return student;
  }

  public List<Student> list() {
    String sql = "Select  * from student";
    List<Student> students = jdbcTemplate.query(sql, new StudentMapper());

    return students;
  }

  public void delete(Integer id) {
    String sql = "delete from student where id = ?";
    jdbcTemplate.update(sql, id);
    System.out.printf("Delete student, id= %s", id);

  }

  public void update(Integer id, Integer age) {
    String sql = "Update student set age = ? where id = ?";
    jdbcTemplate.update(sql, age, id);
    System.out.printf("Update student, id= %s", id);

  }
}

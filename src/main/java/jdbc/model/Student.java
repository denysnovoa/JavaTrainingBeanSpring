package jdbc.model;

public class Student {
  private Integer age, id;
  private String name;

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student(Integer id, Integer age, String name) {
    this.age = age;
    this.id = id;
    this.name = name;
  }
}

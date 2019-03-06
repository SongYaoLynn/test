public class Demo {
  private Integer id;
  private String name;
  private Integer age;
  private String school;

  public Demo() {

  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Demo(Integer id, String name, Integer age, String school) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.school = school;
  }

  @Override
  public String toString() {
    return "Demo{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", age=" + age +
      ", school='" + school + '\'' +
      '}';
  }
}

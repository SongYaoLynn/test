public class Demo {
  private String id;
  private String name;
  private Integer age;
  private String school;

  public Demo(String id, String name, Integer age, String school) {
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

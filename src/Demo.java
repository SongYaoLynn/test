public class Demo {
  private String id;
  private String name;

  public Demo(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Demo{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      '}';
  }
}

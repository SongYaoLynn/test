public class Demo {
  private Integer id;
  private String name;

  public Demo() {

  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "id : " + id + "  name: " + name;
  }
}

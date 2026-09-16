package teacher;

public class Teacher {
  private String name;
  private int age;
  private String gender;
  private int year_joined;
  private String[] subject;
  private String id;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getId() {
    return id;
  }

  public String[] getSubject() {
    return subject;
  }

  public int getYear_joined() {
    return year_joined;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSubject(String[] subject) {
    this.subject = subject;
  }

  public void setYear_joined(int year_joined) {
    this.year_joined = year_joined;
  }

  Teacher(String name,
      int age,
      String gender,
      int year_joined,
      String[] subject,
      String id) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.year_joined = year_joined;
    this.subject = subject;
    this.id = id;
  }

}

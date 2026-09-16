package student;

public class Student {
  private String name;
  private int age;
  private String gender;
  private int semester;
  private String course;
  private double avg_cgpa;
  private String roll_no;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getAvg_cgpa() {
    return avg_cgpa;
  }

  public String getCourse() {
    return course;
  }

  public String getGender() {
    return gender;
  }

  public String getRoll_no() {
    return roll_no;
  }

  public int getSemester() {
    return semester;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAvg_cgpa(double avg_cgpa) {
    this.avg_cgpa = avg_cgpa;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoll_no(String roll_no) {
    this.roll_no = roll_no;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  Student(String name,
      int age,
      String gender,
      int semester,
      String course,
      double avg_cgpa,
      String roll_no) {
    this.name = name;
    this.age = age;
    this.semester = semester;
    this.course = course;
    this.avg_cgpa = avg_cgpa;
    this.roll_no = roll_no;
  }

    Student(String name,
      int age,
      String gender,
      int semester,
      String course,
      String roll_no) {
    this.name = name;
    this.age = age;
    this.semester = semester;
    this.course = course;
    this.avg_cgpa = 0.0;
    this.roll_no = roll_no;
  }
}

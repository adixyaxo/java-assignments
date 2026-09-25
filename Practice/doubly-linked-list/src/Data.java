public class Data {
  String name;
  String roll_no;

  Data(String name, String roll_no) {
    this.name = name;
    this.roll_no = roll_no;
  }

  public void Display() {
    System.out.println("Name: " + this.name + " Roll No: " + this.roll_no);
  }

}
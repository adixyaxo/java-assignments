public class Data {
  String name;
  int roll_no;

  Data(String name, int roll_no) {
    this.name = name;
    this.roll_no = roll_no;
  }

  public void Display() {
    System.out.println("Name: " + this.name);
    System.out.println("Roll no: " + this.roll_no);
  }
}
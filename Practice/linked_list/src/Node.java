public class Node {

  Node(Data data) {
    this.data = data;
  }

  Node(String name, int roll_no) {
    this.data = new Data(name, roll_no);
    next = null;
  }

  Data data;
  Node next;

}
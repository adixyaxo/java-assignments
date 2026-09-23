public class Node {

  Node(Data data/*, Node next*/) {
    this.data = data;
    //this.next = next;
  }

  Node(String name, int roll_no/*, Node next*/) {
    this.data = new Data(name, roll_no);
    next = null;
    //this.next = next;
  }

  Data data;
  Node next;

}
public class LinkedList {
  public Node head = null;
  public Node current = null;

  public void NewLinkedList(String name, int roll_no) {
    Node head = new Node(name, roll_no, null);
    this.head = head;
    this.current = head;
  }

  public void InsertNewNode(String name, int roll_no) {
    current.next = new Node(name, roll_no, null);
    current = current.next;
  }

  public void Display() {
    Node traversal = head;
    while (traversal != null) {
      traversal.data.Display();
      System.out.println();
      traversal = traversal.next;
    }
  }
}
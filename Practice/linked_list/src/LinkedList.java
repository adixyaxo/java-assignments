public class LinkedList {
  public Node Head = null;
  public Node current = null;

  LinkedList() {

  }

  LinkedList(String name, int roll_no) {
    CreateHead(name, roll_no);
  }

  private void CreateHead(String name, int roll_no) {
    Head = new Node(name, roll_no);
    this.current = Head;
  }

  public void InsertAtEnd(String name, int roll_no) {
    if (Head == null) {
      CreateHead(name, roll_no);
    } else {
      current.next = new Node(name, roll_no);
      current = current.next;
    }
  }

  public void InsertAtStart(String name, int roll_no){
    Node new_node = new Node(name,roll_no);
    new_node.next = Head;
    Head = new_node;
  }

  public void InsertAtIndex(String name, int roll_no, int index) {
    if (index < 0) {
      System.out.println("Negetive Index is not allowed");
      return;
    }
    if (index==0) {
      this.InsertAtStart(name, roll_no);
      return;
    }
    Node node_at_i = GetNode(index);
    Node node_before_i = GetNode(index - 1);
    if (node_at_i == null) {
      if (node_before_i != null) {
        this.InsertAtEnd(name, roll_no);
        return;
      } else {
        System.out.println("Error: Index out of bound");
        return;
      }
    }
    Node new_node = new Node(name, roll_no);
    new_node.next = node_at_i;
    node_before_i.next = new_node;
  }

  public void Display() {
    Node traversal = Head;
    while (traversal != null) {
      traversal.data.Display();
      System.out.println();
      traversal = traversal.next;
    }
  }

  public Node GetNode(int index) {
    if (index<0) {
      return null;
    }
    Node traversal = Head;
    for (int i = 0; i < index; i++) {
      if (traversal == null) {
        return null;
      }
      traversal = traversal.next;
    }
    return traversal;
  }

  public void DisplayNodeAtIndex(int index) {
    Node node = GetNode(index);
    if (node == null) {
      System.out.println("The Index is out of bound");
      return;
    }
    node.data.Display();
  }

}
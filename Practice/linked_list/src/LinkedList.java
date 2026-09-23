public class LinkedList {
  public Node Head = null;
  public Node current = null;

  LinkedList(){

  }

  LinkedList(String name,int roll_no){
    CreateHead(name, roll_no);
  }


  private void CreateHead(String name, int roll_no) {
    Head = new Node(name, roll_no);
    this.current = Head;
  }

  public void InsertNewNode(String name, int roll_no) {

    if(Head == null)
    {
      CreateHead(name, roll_no);
    }
    else
    {
      current.next = new Node(name, roll_no);
      current = current.next;
    }
  }

  public void Display() {
    Node traversal = Head;
    while (traversal != null) {
      traversal.data.Display();
      System.out.println();
      traversal = traversal.next;
    }
  }
}
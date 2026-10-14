public class CLinkedList {
  Node tail;

  CLinkedList(int data) {
    tail = new Node();
    tail.data = data;
    tail.next = tail;
  }

  CLinkedList() {
    tail = null;
  }

  public void InsertFront(int data) {
    if (tail == null) {
      tail = new Node();
      tail.data = data;
      tail.next = tail;
      return;
    }
    Node head = tail.next;
    tail.next = new Node();
    tail.next.data = data;
    tail.next.next = head;
  }

  public void InsertBack(int data){
    InsertFront(data);
    tail = tail.next;
  }

  public void DeleteFront(){
    if (tail==null) {
      System.out.println("There is no node present to delete");
      return;
    }
    if (tail.next == tail) {
      tail = null;
      return;
    }
    Node head = tail.next;
    tail.next = head.next;
    head.next = null;
  }

  public void DeleteBack(){
    if (tail==null) {
      System.out.println("There is no node present to delete");
      return;
    }
    if (tail.next == tail) {
      tail = null;
      return;
    }
    Node traversal = tail;
    while (traversal.next != tail) {
      traversal = traversal.next;
    }
    traversal.next = tail.next;
    tail.next = null;
    tail = traversal;
  }

  public void Print(){
    System.out.println();
    Node traversal = tail.next;
    while (traversal != tail) {
      System.out.println(traversal.data);
      traversal = traversal.next;
    }
    System.out.println(tail.data);
    System.out.println();
  }

  void FindCycle(){
    Node Fast = tail;
    Node Slow = tail;
    while (true) {
      if (Fast == null || Slow == null) {
        System.out.println("End of Linked List Reached");
        return;
      }
      Fast = Fast.next.next;
      Slow = Slow.next;
      if (Fast == Slow) {
        System.out.println("Yes it is a cycle");
        return;
      }
    }
  }

}

public class DLL {
  Node base;
  Node tail;

  DLL() {
    base = null;
    tail = null;
  }

  DLL(String name, String roll_no) {
    base = new Node(new Data(name, roll_no));
    base.prev = null;
    tail = null;
    base.next = tail;

  }

  public void DisplayFromStart() {
    if (base == null) {
      System.out.println("No elements found in the Linked List");
      return;
    }
    Node traversal = base;
    while (traversal != null) {
      traversal.data.Display();
      traversal = traversal.next;
    }
  }

  public void DisplayFromEnd() {
    if (base == null) {
      System.out.println("No elements found in the Linked List");
      return;
    }
    if (tail == null) {
      base.data.Display();
      return;
    }
    Node traversal = tail;
    while (traversal != null) {
      traversal.data.Display();
      traversal = traversal.prev;
    }
  }

  public void InsertAtEnd(String name, String roll_no) {
    if (base == null) {
      base = new Node(new Data(name, roll_no));
      base.prev = null;
      base.next = tail;
      tail = null;
      return;
    } else if (tail == null) {
      tail = new Node(new Data(name, roll_no));
      tail.prev = base;
      tail.next = null;
      base.next = tail;
      return;
    }
    tail.next = new Node(new Data(name, roll_no));
    tail.next.prev = tail;
    tail = tail.next;
    tail.next = null;
    return;
  }

  public void DeleteFromStart() {
    Node OldBase = base;
    base = base.next;
    OldBase.next = null;
    base.prev = null;
    return;
  }

  public void DeleteFromEnd() {
    Node OldTail = tail;
    tail = tail.prev;
    OldTail.prev = null;
    tail.next = null;
    return;
  }

  public void Delete(int index) {
    if (index < 0) {
      System.out.println("Index out of bound");
      return;
    }
    if (index == 0) {
      DeleteFromStart();
      return;
    }
    Node traversal = base;
    for (int i = 0; i < index; i++) {
      traversal = traversal.next;
    }
    if (traversal == null) {
      System.out.println("Index out of bound");
      return;
    }
    if (traversal.next == null) {
      DeleteFromEnd();
      return;
    }
    Node next = traversal.next;
    traversal.next = null;
    Node prev = traversal.prev;
    traversal.prev = null;
    next.prev = prev;
    prev.next = next;
  }

  public void Delete(int index, boolean from_back) {
    if (index < 0) {
      System.out.println("Index out of bound");
      return;
    }
    if (index == 0) {
      DeleteFromEnd();
      return;
    }
    if (from_back) {
      Node traversal = tail;
      for (int i = 0; i < index; i++) {
        traversal = traversal.prev;
      }
      if (traversal == null) {
        System.out.println("Index out of bound");
        return;
      }
      if (traversal.prev == null) {
        DeleteFromStart();
        return;
      }
      Node next = traversal.next;
      traversal.next = null;
      Node prev = traversal.prev;
      traversal.prev = null;
      next.prev = prev;
      prev.next = next;
      return;
    } else {
      Delete(index);
    }
  }
}

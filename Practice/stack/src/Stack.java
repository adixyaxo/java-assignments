public class Stack {
  private Node lastNode;

  Stack(int data) {
    lastNode = new Node(data);
  }

  Stack() {
    lastNode = null;
  }

  Node pop() {
    if (lastNode == null) {
      System.out.println("The stack is empty no node present to delete");
      return null;
    }
    Node node = lastNode;
    lastNode = lastNode.next;
    node.next = null;
    return node;
  }

  Node pop(int index) {
    if (lastNode == null) {
      System.out.println("The stack is empty no node present to delete");
      return null;
    }
    if (index == 0) {
      this.pop();
      return null;
    }
    Node prev = lastNode;
    for (int i = 0; i < index - 1; i++) {
      prev = prev.next;
    }
    Node node = prev.next;
    prev.next = prev.next.next;
    node.next = null;
    return node;
  }

  void push(int data) {
    Node node = new Node(data);
    node.next = lastNode;
    lastNode = node;
  }

  void push(int data, int index) {
    if (index == 0) {
      this.push(data);
      return;
    }
    Node prev = lastNode;
    for (int i = 0; i < index - 1; i++) {
      prev = prev.next;
    }
    Node node = new Node(data);
    node.next = prev.next;
    prev.next = node;
  }

  private void displayFromBack_func(Node node) {
    if (node == null) {
      return;
    }
    displayFromBack_func(node.next);
    node.display();
  }

  void displayFromBack() {
    displayFromBack_func(lastNode);
  }

  void display() {
    Node node = lastNode;
    while (node != null) {
      node.display();
      node = node.next;
    }
  }



}

public class Node {
  Node next;
  int data;

  public void display(){
    System.out.println(data);
  }

  Node(int data){
    this.data = data;
    this.next = null;
  }

  Node(){}

}
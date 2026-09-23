public class App {
    public static void main(String[] args) throws Exception {
        LinkedList l1 = new LinkedList();
        l1.InsertAtEnd("Aditya Dagar", 0);
        l1.InsertAtIndex("Aditya Dagar", 1,0);
        l1.InsertAtIndex("Aditya Dagar", 2,0);
        l1.InsertAtIndex("Aditya Dagar", 3,0);
        l1.InsertAtIndex("Aditya Dagar", 4,0);
        l1.Display();

        LinkedList l2 = new LinkedList("Aditya Dagar", 0);
        l2.InsertAtEnd("Aditya Dagar", 1);
        l2.InsertAtEnd("Aditya Dagar", 2);
        l2.InsertAtEnd("Aditya Dagar", 3);
        l2.InsertAtEnd("Aditya Dagar", 4);
        l2.DisplayNodeAtIndex(0);
        l2.DisplayNodeAtIndex(2);
        l2.DisplayNodeAtIndex(5);
    }
}

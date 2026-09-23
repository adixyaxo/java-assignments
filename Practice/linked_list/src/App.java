public class App {
    public static void main(String[] args) throws Exception {
        LinkedList l1 = new LinkedList();
        l1.InsertNewNode("Aditya Dagar", 0);
        l1.InsertNewNode("Aditya Dagar", 1);
        l1.InsertNewNode("Aditya Dagar", 2);
        l1.InsertNewNode("Aditya Dagar", 3);
        l1.InsertNewNode("Aditya Dagar", 4);
        l1.Display();

        LinkedList l2 = new LinkedList("Aditya Dagar", 0);
        l2.InsertNewNode("Aditya Dagar", 1);
        l2.InsertNewNode("Aditya Dagar", 2);
        l2.InsertNewNode("Aditya Dagar", 3);
        l2.InsertNewNode("Aditya Dagar", 4);
        l2.Display();
    }
}

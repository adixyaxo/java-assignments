public class App {
    public static void main(String[] args) throws Exception {
        DLL dll = new DLL("Raymon", "0");
        dll.InsertAtEnd("Raymon", "1");
        dll.InsertAtEnd("Raymon", "2");
        dll.InsertAtEnd("Raymon", "3");
        dll.InsertAtEnd("Raymon", "4");
        dll.InsertAtEnd("Raymon", "5");
        dll.InsertAtEnd("Raymon", "6");
        dll.Delete(2);
        dll.Delete(2,true);
        dll.DisplayFromEnd();
        dll.DisplayFromStart();
    }
}

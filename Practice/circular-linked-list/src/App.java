public class App {
    public static void main(String[] args) throws Exception {
        CLinkedList CLL = new CLinkedList();
        CLL.InsertBack(10);
        CLL.InsertBack(9);
        CLL.InsertBack(8);
        CLL.InsertBack(7);
        CLL.InsertBack(6);
        CLL.InsertFront(1);
        CLL.InsertFront(2);
        CLL.InsertFront(3);
        CLL.InsertFront(4);
        CLL.InsertFront(5);

        CLL.Print();

        CLL.DeleteBack();
        CLL.DeleteFront();

        CLL.Print();

        CLL.FindCycle();
        CLL.tail = null;
        CLL.FindCycle();
    }
}

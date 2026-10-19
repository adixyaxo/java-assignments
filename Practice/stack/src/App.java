public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.pop();
        stack.displayFromBack();
    }
}

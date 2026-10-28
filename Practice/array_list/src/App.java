public class App {
    public static void main(String[] args) throws Exception {
        StudentMangement SM = new StudentMangement();
        SM.AddStudent(0, "Aarav Dudhiya");
        SM.AddStudent(1, "Bharat Chai Wala");
        SM.AddStudent(2, "Aman Service Center");
        SM.AddStudent(3, "Abhishek Pandit Ji Basai Wale");
        SM.RemoveStudent(0) ;
        SM.Display();
        SM.DisplayStudent(3);
    }
}

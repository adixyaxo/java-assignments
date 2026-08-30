public class App {
    public static void main(String[] args) throws Exception {
        StudentRecord SR = new StudentRecord();
        SR.StudentRecord_main();

        BankAccount BA = new BankAccount();
        BA.BankAccount_main();

        RectangleModel RM = new RectangleModel();
        RM.RectangleModel_main();

        BookLoan BL = new BookLoan();
        BL.BookLoan_main();

        ProductInventory PI = new ProductInventory();
        PI.ProductInventory_main();

        CourseEnrollment CE = new CourseEnrollment();
        CE.CourseEnrollment_main();

        ObjectReferenceLab ORL = new ObjectReferenceLab();
        ORL.ObjectReferenceLab_main();

        StringFundamentals SF = new StringFundamentals();
        SF.StringFundamentals_main();

        StringBuilderToolkit SBT = new StringBuilderToolkit();
        SBT.StringBuilderToolkit_main();

        TextProfile TP = new TextProfile();
        TP.TextProfile_main(args);
    }
}

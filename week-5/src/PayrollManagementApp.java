public class PayrollManagementApp {

  public void PyayrollManagementApp_main() {
    PayrollProcessor payrollProcessor = new PayrollProcessor(5);

    SalariedEmployee salariedEmployee = new SalariedEmployee("Aarav Milkman", "E001", 500);
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Abhishek Manpower", "E002", 10, 160);
    Invoice invoice = new Invoice("001", 1500);

    payrollProcessor.addPayable(salariedEmployee);
    payrollProcessor.addPayable(hourlyEmployee);
    payrollProcessor.addPayable(invoice);

    double totalPayments = payrollProcessor.calculatePayments();
    System.out.println("Total Payments: " + Double.toString(totalPayments));

  }

  public interface Payable {
    double PaymentAmount();
  }

  public abstract class Employee implements Payable {
    protected String name;
    protected String employeeId;

    public Employee(String name, String employeeId) {
      this.name = name;
      this.employeeId = employeeId;
    }

    public String getName() {
      return name;
    }

    public String getEmployeeId() {
      return employeeId;
    }
  }

  public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String employeeId, double monthlySalary) {
      super(name, employeeId);
      this.monthlySalary = monthlySalary;
    }

    @Override
    public double PaymentAmount() {
      return monthlySalary;
    }
  }

  public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, String employeeId, double hourlyRate, double hoursWorked) {
      super(name, employeeId);
      this.hourlyRate = hourlyRate;
      this.hoursWorked = hoursWorked;
    }

    @Override
    public double PaymentAmount() {
      return hourlyRate * hoursWorked;
    }
  }

  public class Invoice implements Payable {
    private String invoiceId;
    private double amount;

    public Invoice(String invoiceId, double amount) {
      this.invoiceId = invoiceId;
      this.amount = amount;
    }

    @Override
    public double PaymentAmount() {
      return amount;
    }
  }

  public class PayrollProcessor {
    private Payable[] payables;
    private int count;

    public PayrollProcessor(int count) {
      this.payables = new Payable[count];
      this.count = count;
    }

    public void addPayable(Payable payable) {
      if (count < payables.length) {
        payables[count] = payable;
        count++;
      } else {
        System.out.println("Payroll is full. Cannot add more payables.");
      }
    }

    public double calculatePayments() {
      double totalPayments = 0;
      for (int i = 0; i < count; i++) {
        totalPayments += payables[i].PaymentAmount();
      }
      return totalPayments;
    }
  }
}

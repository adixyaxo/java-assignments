public class CampusManagementApp {

  public void CampusManagementApp_main() {
    CampusRegistry registry = new CampusRegistry(10);

    Student student1 = new Student("Ramniwas", new int[]{3, 4, 5});
    Researcher researcher1 = new Researcher("Aditya", "AI");

    registry.addPerson(student1);
    registry.addPerson(researcher1);

    registry.Display();
  }

  private abstract class Person{
    private String name;

    public Person(String name){
      this.name = name;
    }

    public String getName(){
      return name;
    }
  }

  public class Student extends Person{
    private int[] CGPA;

    public Student(String name, int[] CGPA){
      super(name);
      this.CGPA = CGPA;
    }

    public double calculateAverageCGPA(){
      int sum = 0;
      for(int i = 0; i < CGPA.length; i++){
        sum += CGPA[i];
      }
      return (double)sum / CGPA.length;
    }
  }

  public class Researcher extends Person{
    private String researchArea;

    public Researcher(String name, String researchArea){
      super(name);
      this.researchArea = researchArea;
    }
  }

  public class CampusRegistry{
    private Person[] arr;

    private int count;

    public CampusRegistry(int size){
      this.arr = new Person[size];
      this.count = 0;
    }

    public void addPerson(Person p){
      if(count < arr.length){
        arr[count] = p;
        count++;
      }
      else{
        System.out.println("Registry is full. Cannot add more persons.");
      }
    }

    public void Display(){
      for (int i = 0; i < count; i++) {
        System.out.println(arr[i]);
      }
    }
  }
}

package lecture;
import student.Student;
import teacher.Teacher;

public class Lecture {
  int maximum_occupacity;
  Student[] students;
  Teacher teacher;

  public void TakeInput(){

  }

  Lecture(int maximum_occupacity,Teacher teacher){
    this.maximum_occupacity = maximum_occupacity;
    this.teacher = teacher;
    this.students = new Student[maximum_occupacity];
  }

  public void Display(){
    System.out.println("Maximum Occupancy: "+ maximum_occupacity);
    System.out.println("Teacher: "+teacher.getName());
    System.out.println("STUDENT LIST");
    for (int i = 0; i < students.length; i++) {
      System.out.println(i + ": " + students[i].getName());
    }
  }

}

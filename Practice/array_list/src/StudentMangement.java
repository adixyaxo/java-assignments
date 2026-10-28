import java.util.ArrayList;

public class StudentMangement {
  ArrayList<StudentInfo> students;

  StudentMangement() {
    students = new ArrayList<StudentInfo>();
  }

  boolean IsExists(int student_id) {
    for (StudentInfo s : students) {
      if (s.getStudent_id() == student_id) {
        return true;
      }
    }
    return false;
  }

  void AddStudent(int student_id, String student_name) {
    if (IsExists(student_id)) {
      System.out.println("The Student Id Already Exists");
      return;
    }
    this.students.add(new StudentInfo(student_id, student_name));
  }

  void RemoveStudent(int student_id) {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getStudent_id() == student_id) {
        students.remove(i);
        System.out.println("Student removed sucessfully");
        return;
      }
    }
    System.out.println("Student Not Found");
  }

  void Display(){
    System.out.println("Student ID  : Student Name");
    for (StudentInfo s : students) {
      s.Display();
    }
  }

  void DisplayStudent(int student_id){
    for(StudentInfo s : students){
      if (s.getStudent_id() == student_id) {
        s.Display();
        return;
      }
    }
    System.out.println("No student found with the Student Id: " + student_id);
  }

  void UpdateStudent(int student_id_old , int student_id_new){
    for(StudentInfo s : students){
      if (s.getStudent_id() == student_id_old) {
        s.setStudent_id(student_id_new);
        System.out.println("Student ID updated successfully");
        return;
      }
    }
    System.out.println("Student Not Found");
  }

  void UpdateStudent(String student_name_old , String student_name_new){
    for(StudentInfo s : students){
      if (s.getStudent_name() == student_name_old) {
        s.setStudent_name(student_name_new);
        System.out.println("Student ID updated successfully");
        return;
      }
    }
    System.out.println("Student Not Found");
  }
}

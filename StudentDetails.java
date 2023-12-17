package basi_java;

//Student class
class Student {
 // Instance variables
 String name;
 int age;
 String department;

 // Default constructor
 public Student() {
     this.name = "Unknown";
     this.age = 20;
     this.department = "Unassigned";
 }

 // Constructor with name and age parameters
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
     this.department = "IT";
 }

 // Constructor with name, age, and department parameters
 public Student(String name, int age, String department) {
     this.name = name;
     this.age = age;
     this.department = department;
 }
}

//Main class
public class StudentDetails {
 public static void main(String[] args) {
     // Create instances of Student using each constructor
     Student student1 = new Student("Deepti",20,"IT");
     Student student2 = new Student("Debaki", 20,"IT");
     Student student3 = new Student("Viju", 22, "Computer Science");

     // Print details of each student
     System.out.println("Student 1: Name - " + student1.name + ", Age - " + student1.age + ", Department - " + student1.department);
     System.out.println("Student 2: Name - " + student2.name + ", Age - " + student2.age + ", Department - " + student2.department);
     System.out.println("Student 3: Name - " + student3.name + ", Age - " + student3.age + ", Department - " + student3.department);
 }
}
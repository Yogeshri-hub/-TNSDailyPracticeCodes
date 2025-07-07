import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;
    
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}

public class GradeManager {
    static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Save to File");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    students.add(new Student(name, marks));
                    break;
                case 2:
                    System.out.println("\nStudent List:");
                    for (Student s : students) {
                        System.out.println(s.name + " - " + s.marks + " - Grade: " + s.getGrade());
                    }
                    break;
                case 3:
                    FileWriter fw = new FileWriter("students.txt");
                    for (Student s : students) {
                        fw.write(s.name + "," + s.marks + "," + s.getGrade() + "\n");
                    }
                    fw.close();
                    System.out.println("Data saved to students.txt");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 4);
    }
}

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n===== SCHOOL SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. View All Students");
            System.out.println("4. View All Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter ID: ");
                    int sId = Integer.parseInt(input.nextLine());
                    System.out.print("Enter Name: ");
                    String sName = input.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = input.nextLine();
                    
                    studentList.add(new Student(sId, sName, grade));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    
                    System.out.print("Enter ID: ");
                    int tId = Integer.parseInt(input.nextLine());
                    System.out.print("Enter Name: ");
                    String tName = input.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = input.nextLine();
                    
                    teacherList.add(new Teacher(tId, tName, subject));
                    System.out.println("✅ Teacher added successfully!");
                    break;

                case 3:
                  
                    System.out.println("\n--- LIST OF STUDENTS ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student s : studentList) {
                            s.displayInfo(); 
                        }
                    }
                    break;

                case 4:
                    
                    System.out.println("\n--- LIST OF TEACHERS ---");
                    if (teacherList.isEmpty()) {
                        System.out.println("No teacher records found.");
                    } else {
                        for (Teacher t : teacherList) {
                            t.displayInfo(); 
                        }
                    }
                    break;

                case 5:
                    
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println(" Invalid choice! Please try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
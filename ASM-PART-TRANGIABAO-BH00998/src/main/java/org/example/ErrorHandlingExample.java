package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ErrorHandlingExample {
    private static final List<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); //Consume newline

            // Check for duplicate ID
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Error: Student with ID " + id + " already exists.");
                    return;
                }
            }
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); //Consume newline
            // Validate marks
            if (marks < 0 || marks > 10) {
                System.out.println("Error: Marks should be between 0 and 10.");
                return;
            }
            students.add(new Student(id, name, marks));
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            scanner.nextLine(); // Clear invalid input
        }
    }
    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //Consume newline
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> {
                    System.out.println("Exiting program.");
                    return;
                }
                default -> System.out.println("Error: Invalid choice. Please select a valid option.");
            }
        }
    }
}
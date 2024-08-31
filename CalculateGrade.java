import java.util.*;

public class CalculateGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Initialize variables for total marks
        int totalMarks = 0;

        // Loop to input marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Determine grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Create arrays to store the data for each student
        int[] rollNumbers = new int[n];
        int[] marks1 = new int[n];
        int[] marks2 = new int[n];
        int[] marks3 = new int[n];
        int[] totalMarks = new int[n];
        String[] grades = new String[n];

        // Get the data for each student
        for (int i = 0; i < n; i++) {
            System.out.print('\n' + "Enter roll number of student " + (i + 1) + ": ");
            rollNumbers[i] = sc.nextInt();

            System.out.print("Enter marks obtained in subject 1: ");
            marks1[i] = sc.nextInt();

            System.out.print("Enter marks obtained in subject 2: ");
            marks2[i] = sc.nextInt();

            System.out.print("Enter marks obtained in subject 3: ");
            marks3[i] = sc.nextInt();

            totalMarks[i] = marks1[i] + marks2[i] + marks3[i];

            // Calculate the percentage and grade
            double percentage = (double) totalMarks[i] / 3.0;
            String grade = "";

            if (percentage >= 80.0) {
                grade = "A";
            } else if (percentage >= 60.0) {
                grade = "B";
            } else if (percentage >= 40.0) {
                grade = "C";
            } else {
                grade = "D";
            }

            grades[i] = grade;
        }

        // Print the results
        System.out.println('\n' + "Roll No.\tMarks1\tMarks2\tMarks3\tTotal Marks\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            double percentage = (double) totalMarks[i] / 3.0;
            System.out.printf("%d\t\t%d\t%d\t%d\t%d\t\t%.2f\t\t %s\n", rollNumbers[i], marks1[i], marks2[i], marks3[i],
                    totalMarks[i], percentage, grades[i]);
        }

    }
}

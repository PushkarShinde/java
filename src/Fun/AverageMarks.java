import java.util.Scanner;

class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        double totalMarks = 0;

        // Loop to get input for each subject
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate and display average
        double average = totalMarks / totalSubjects;
        System.out.println("The average marks are: " + average);

        scanner.close();
    }
}

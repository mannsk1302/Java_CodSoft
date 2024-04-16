import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        //Input From the User:
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Subject 1 Marks(Out of 100): ");
        int sub_1 = scn.nextInt();
        System.out.print("Enter Your Subject 2 Marks(Out of 100): ");
        int sub_2 = scn.nextInt();
        System.out.print("Enter Your Subject 3 Marks(Out of 100): ");
        int sub_3 = scn.nextInt();
        System.out.print("Enter Your Subject 4 Marks(Out of 100): ");
        int sub_4 = scn.nextInt();
        System.out.print("Enter Your Subject 5 Marks(Out of 100): ");
        int sub_5 = scn.nextInt();
        System.out.println();

        //Calculate Total Marks:
        int totalMarks = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;

        //Calculate Average Percentage:
        int avgPercentage = totalMarks / 5;

        // Display Results:
        System.out.println("Your Total Marks Scored is " + totalMarks + ".");
        System.out.println("Your Average Percentage is " + avgPercentage + ".");

        //Grade Calculation:
        if (avgPercentage >= 90 && avgPercentage <= 100) {
            char grade = 'O';
            System.out.print("Grade Scored By You is: " + grade);
        } else if (avgPercentage >= 75 && avgPercentage <= 89) {
            String grade = "A+";
            System.out.print("Grade Scored By You is: " + grade);
        } else if (avgPercentage >= 65 && avgPercentage <= 74) {
            char grade = 'A';
            System.out.print("Grade Scored By You is: " + grade);
        } else if (avgPercentage >= 55 && avgPercentage <= 64) {
            String grade = "B+";
            System.out.print("Grade Scored By You is: " + grade);
        } else if (avgPercentage >= 50 && avgPercentage <= 54) {
            char grade = 'B';
            System.out.print("Grade Scored By You is: " + grade);
        } else if (avgPercentage >= 45 && avgPercentage <= 49) {
            char grade = 'C';
            System.out.print("Grade Scored By You is: " + grade);
        } else if (avgPercentage >= 40 && avgPercentage <= 44) {
            char grade = 'P';
            System.out.print("Grade Scored By You is: " + grade);
        } else {
            char grade = 'F';
            System.out.print("Grade Scored By You is: " + grade);
        }
    }
}
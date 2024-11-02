import java.util.Scanner;

public class GradeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letterGrade = scanner.nextLine();
        double numericGrade = Grade.getNumericGrade(letterGrade);
        if (numericGrade == -1.0) {
            System.out.println("Invalid letter grade.");
        } else {
            System.out.println("The numeric value is " + numericGrade + ".");
        }
        scanner.close();
    }

}

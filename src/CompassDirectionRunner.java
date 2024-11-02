import java.util.Scanner;

public class CompassDirectionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        int angle = scanner.nextInt();

        String direction = CompassDirection.getDirection(angle);
        System.out.println("The nearest compass direction is: " + direction);
    }
}

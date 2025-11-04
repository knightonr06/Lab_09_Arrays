import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int userValue;

        do {
            System.out.print("Enter a number between 1 and 100: ");
            userValue = in.nextInt();
        } while (userValue < 1 || userValue > 100);

        System.out.println("You entered: " + userValue);
    }
}

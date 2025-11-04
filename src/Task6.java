import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(scanner, "Enter an int between 1 and 100: ", 1, 100);
        System.out.println("You entered: " + userValue);

        int[] dataPoints = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int count = 0;
        for (int v : dataPoints) {
            if (v == userValue) count++;
        }
        System.out.printf("The value %d was found %d time(s) in the array.%n", userValue, count);
    }
}

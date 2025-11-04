import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        int userValue = SafeInput.getRangedInt(scanner, "Enter an int between 1 and 100 to search for: ", 1, 100);

        int foundIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex >= 0) {
            System.out.printf("The value %d was found at array index %d.%n", userValue, foundIndex);
        } else {
            System.out.printf("The value %d was not found in the array.%n", userValue);
        }
    }
}

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        // Regular for loop
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1; // random number 1–100
        }

        // Optional: print them out to check
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.println( i + " = " + dataPoints[i]);
        }
    }
}

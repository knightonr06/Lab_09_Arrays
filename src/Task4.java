// src/average.java
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] average = new int[100];

        for (int i = 0; i < average.length; i++) {
            average[i] = rand.nextInt(100) + 1; // random number 1–100
        }

        int sum = 0;
        for (int val : average) {
            sum += val;
        }

        double avg = (double) sum / average.length;
        System.out.printf("The average for this array is: %.2f%n", avg);
    }
}

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            int v = dataPoints[i];
            if (v < min) min = v;
            if (v > max) max = v;
        }

        System.out.printf("Minimum value in the array: %d%n", min);
        System.out.printf("Maximum value in the array: %d%n", max);
    }
}


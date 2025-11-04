import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1; // 1-100
        }

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        if (values == null || values.length == 0) {
            return 0.0;
        }
        long sum = 0L;
        for (int v : values) {
            sum += v;
        }
        return sum / (double) values.length;
    }
}

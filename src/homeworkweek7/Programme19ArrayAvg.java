package homeworkweek7;

import java.util.Arrays;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

public class Programme19ArrayAvg {
    public static void main(String[] args) {
        int[] arr = {67, 84, 59, 27, 31, 99, 15, 42, 50, 79};
        System.out.println("Numbers of the arrays are : " + Arrays.toString(arr));

        int sum = 0;
        double avg;

        for (int j : arr) {
            sum += j;
        }
        avg = (double) sum / arr.length;
        System.out.println("Average of Array numbers is : " + avg);
    }
}

package homeworkweek7;

import java.util.Arrays;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Programme18ArraySum {

    public static void main(String[] args) {

        int[] num = {56, 78, 99, 45, 54, 67, 15, 81, 23};

        int sum = 0;
        for (int num1 : num) {
            sum += num1;
        }
        System.out.println("Numbers are: " + Arrays.toString(num));
        System.out.println("Sum of Array: " + sum);
    }
}
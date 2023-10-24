package homeworkweek7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme20ArrayValue {
    public static void main(String[] args) {
        // Int array declaration
        int[] num = {83, 45, 97, 86, 36, 63, 16, 22, 59};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find in array:");
        int value = sc.nextInt();
        System.out.println("Original Array Numbers are : " + Arrays.toString(num));
        sc.close();

        boolean c = false;
        for (int number : num) {
            if (number == value) {
                c = true;
                break;
            }
        }
        if (c) {
            System.out.println("The array contains value: " + value);
        } else {
            System.out.println("The array does not contains value : " + value);
        }
    }
}

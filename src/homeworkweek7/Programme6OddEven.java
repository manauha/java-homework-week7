package homeworkweek7;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Programme6OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to find out the number is even or odd: ");
        int num = scn.nextInt();
        oddEven(num);
        scn.close();
    }
        public static void oddEven(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}



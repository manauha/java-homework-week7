package homeworkweek7;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Programme16NumCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        double num = sc.nextDouble();
        check(num);
        sc.close();
    }
    public static void check(double num) {

        if (num > 0) {
            System.out.println("A NUMBER ENTERED IS POSITIVE");
        } else if (num < 0) {
            System.out.println("A NUMBER ENTERED IS NEGATIVE");
        } else {
            System.out.println("A NUMBER ENTERED IS ZERO");
        }
    }
}

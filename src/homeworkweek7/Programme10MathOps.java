package homeworkweek7;

/**
 * 10. Write a java program to input any two number and ask user to enter their
 * symbol (+, -, /, *) find addition, Subtraction, multiplication and division
 * according to their symbol (using if else)
 */

import java.util.Scanner;

public class Programme10MathOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = sc.nextByte();
        System.out.print("Enter one symbol from given ( + , - , * , / ) : ");
        char ops = sc.next().charAt(0);
        mathOps(num1, num2, ops);
        sc.close();
    }
    public static void mathOps(int num1, int num2, char ops) {
        if (ops == '+') {
            System.out.println("Sum : " + (num1 + num2));
        } else if (ops == '-') {
            System.out.println("Subtraction : " + (num1 - num2));
        } else if (ops == '*') {
            System.out.println("Product : " + (num1 * num2));
        } else if (ops == '/') {
            if (num2 != 0)
                System.out.println("Division of " + num1 + "/" + num2 + ": " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not possible");
        }
    }
}








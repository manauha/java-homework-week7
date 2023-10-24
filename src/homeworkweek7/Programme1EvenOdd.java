package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User input
        System.out.print("Enter integer number: ");
        int num = input.nextInt();
        //calling method directly with parameter
        evenOdd(num);
        //Scanner close
        input.close();
    }
        public static void evenOdd(int num){
        //ternary syntax:  variable = (condition) ? expressionTrue :  expressionFalse;
        String result = (num%2==0)? "even":"odd";
        System.out.println(num + " is an "+ result + " Number.");
    }
}

package homeworkweek7;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Programme2LeapYear {
    public static void main(String[] args) {
        System.out.println("This program find out entered year is lear year or not.");
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        //direct method calling with parameter
        leapYear(year);
        sc.close();
    }
    public static void leapYear(int year){
        boolean check = (year%4==0)&&(year%400==0 ||year%100!=0);
        if(check){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

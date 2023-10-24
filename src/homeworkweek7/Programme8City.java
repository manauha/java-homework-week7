package homeworkweek7;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 */
public class Programme8City {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet in CAPITAL from A to F:");
        char alp = input.next().charAt(0);
        city(alp);
        input.close();
    }
    public static void city(char alp) {
        if ((alp != 'A') && (alp != 'B') && (alp != 'C') && (alp != 'D') && (alp != 'E') && (alp != 'F')) {
            System.out.println("INVALID ENTRY, TRY AGAIN");
        } else if (alp == 'A') {
            System.out.println("Aylesbury");
        } else if (alp == 'B') {
            System.out.println("Bath");
        } else if (alp == 'C') {
            System.out.println("Cambridge");
        } else if (alp == 'D') {
            System.out.println("Derby");
        } else if (alp == 'E') {
            System.out.println("Exeter");
        } else if (alp == 'F') {
            System.out.println("Felixstowe");
        } else {
            System.out.println("Hello");
        }
    }
}
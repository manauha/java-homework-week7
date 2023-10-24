package homeworkweek7;

import java.util.Scanner;

/**
 * 9. Input any alphabet from “A" to “F” and print their city name accordingly (use switch)
 * if any other alphabet should be invalid entry
 */

public class Programme9CitySwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet in CAPITAL from A to F:");
        char alp = input.next().charAt(0);
        input.close();
        switch (alp){
            case 'A':
                System.out.println("Aylesbury");
                break;
            case 'B':
                System.out.println("Bath");
                break;
            case 'C':
                System.out.println("Cambridge");
                break;
            case 'D':
                System.out.println("Derby");
                break;
            case 'E':
                System.out.println("Exeter");
                break;
            case 'F':
                System.out.println("Felixstowe");
                break;
            default:
                System.out.println("INVALID ENTRY, TRY AGAIN");
        }
    }
}

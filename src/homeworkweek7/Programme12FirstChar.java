package homeworkweek7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12FirstChar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This programme will find entered character is Alphabet, Number or Symbol");
        System.out.print("Enter a character : ");
        char c = scn.next().charAt(0);
        scn.close();

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is a alphabet");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + " is a digit");
        } else {
            System.out.println(c + "is a symbol or special character");
        }
    }
}




package homeworkweek7;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 and 100 and
 * if it is out of range print error message “Invalid Input, Marks must be between 0 and 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And
 * print Mark Sheet in following format
 * _______________________________
 * |                               |
 * |          Mark Sheet           |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No : 08                  |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________|
 */
public class Programme3MarkSheet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();
        System.out.print("Enter your Math marks: ");
        int math = input.nextInt();
        System.out.print("Enter your Science marks: ");
        int sci = input.nextInt();
        System.out.print("Enter your English marks: ");
        int eng = input.nextInt();
        calculation(sci, math, eng, rollNumber, studentName);
        input.close();
        if ((math < 0 || math > 100) && (sci < 0 || sci > 100) && (eng < 0 || eng > 100)) {
            System.out.println("Invalid Input, Marks must be between 0 and 100");
        }
    }

    public static void calculation(int sci, int math, int eng, int rollNumber, String studentName) {
        int total = (math + sci + eng);
        int percentage = (total / 3);
        System.out.println(" _______________________________");
        System.out.printf("%-1s%32s%n", "|", "|");
        System.out.printf("%-1s%13s%n", "|         Mark Sheet", "|");
        System.out.println("|_______________________________|");
        System.out.printf("%-1s%18s%n", "|  Name    : " + studentName, "|");
        System.out.printf("%-1s%18s%n", "|  Roll No : " + rollNumber, "|");
        System.out.println("|_______________________________|");
        System.out.println("|  Subjects: Marks              |");
        System.out.println("|_______________________________|");
        System.out.printf("%-1s%19s%n", "|  Math    :" + math, "|");
        System.out.printf("%-1s%19s%n", "|  Science :" + sci, "|");
        System.out.printf("%-1s%19s%n", "|  English :" + eng, "|");
        System.out.println("|_______________________________|");
        System.out.printf("%-1s%18s%n", "|  Total   :" + total, "|");
        System.out.println("|_______________________________|");
        System.out.printf("%-1s%18s%n", "|Percentage :" + percentage, "|");
        if (percentage >= 35 && math >= 35 && sci >= 35 && eng >= 35) {
            System.out.println("|Result    : Pass               |");
        } else {
            System.out.println("| Result   : Fail               |");
        }
        grades(percentage);
        System.out.println("|_______________________________|");
    }

    public static void grades(int percentage) {

        if (percentage >= 80 && percentage <= 100) {
            System.out.println("|Grade     : A+                 |");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("|Grade     : A                  |");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("|Grade     : B                  |");
        } else if (percentage >= 35 && percentage < 50) {
            System.out.println("|Grade     : Pass               |");
        } else {
            System.out.println("|Grade     : --                 |");
        }
    }
}
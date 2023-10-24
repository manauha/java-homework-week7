package homeworkweek7;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5%< 10,000 2%
 */

public class Programme7SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sales id: ");
        String empID = input.nextLine();
        System.out.print("Enter seller's name: ");
        String name = input.nextLine();
        System.out.print("Enter sales amount : ");
        float salesAmount = input.nextFloat();
        System.out.print("Enter basic salary:");
        float basicSalary = input.nextFloat();
        salesCommission(salesAmount);
        input.close();
    }
    public static void salesCommission(float salesAmount){

        if (salesAmount >= 50000){
            System.out.println("Sales Commission amount: "+ (salesAmount*35/100));
        } else if (salesAmount >= 30000 && salesAmount < 49999) {
            System.out.println("Sales Commission amount: " + (salesAmount * 20/100));
        } else if (salesAmount >= 20000 && salesAmount < 29999) {
            System.out.println("Sales Commission amount: " + (salesAmount * 10 / 100));
        } else if (salesAmount >=10000 && salesAmount <19999) {
            System.out.println("Sales Commission amount: " + (salesAmount * 5 / 100));
        } else if (salesAmount < 10000){
            System.out.println("Sales Commission amount: " + salesAmount*2/100);
            }
        }
    }


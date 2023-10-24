package homeworkweek7;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF Print in
 * following format
 *   _______________________________
 *  | Salary Slip                  |
 *  |______________________________|
 *  | Employee Id : 2564           |
 *  | Employee Name : Jay          |
 *  |______________________________|
 *  | Basic Salary : 25000.0       |
 *  | HRA 10% : 2500.0             |
 *  | TA 8% : 2250.0               |
 *  | DA 9% : 2000.0               |
 *  | PF - 20& : 5000.0            |
 *  |______________________________|
 *  | Gross Salary : 26750.0       |
 *  |==============================|
 */
public class Programme5Payslip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        String empID = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter you basic salary: ");
        float basicSalary = sc.nextFloat();
        Payslip(basicSalary, empID, name);
        sc.close();
    }
    public static void Payslip(float basicSalary, String empID, String name){
        float hra, ta, da, pf, gs;
        hra = (basicSalary*10/100);
        ta = (basicSalary*8/100);
        da = (basicSalary*9/100);
        pf = (basicSalary*20/100);
        gs = (basicSalary+hra+ta+da+pf);

        System.out.println(" _______________________________");
        System.out.println("|         Salary Slip           |");
        System.out.println("|______________________________ |");
        System.out.println("| Employee Id   :"+empID+      "|");
        System.out.println("| Employee Name :"+name+       "|");
        System.out.println("|_______________________________|");
        System.out.println("|  Basic Salary :"+basicSalary+"|");
        System.out.println("|  HRA 10%      :" + hra   +   "|" );
        System.out.println("|  TA 8%        :" + ta    +   "|");
        System.out.println("| DA 9%         :" + da    +   "|");
        System.out.println("| Gross Salary  :" + gs    +   "|");
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary  :"+ gs     +   "|");
        System.out.println("|===============================|");

    }
}



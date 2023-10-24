package homeworkweek7;

public class Programme11Divided3And5 {
    public static void main(String[] args) {
        System.out.println("List of the numbers divisible by 3 from 1 to 100 :");
        divisibleBy3(1);
        System.out.println("===================================================");
        System.out.println("List of the numbers divisible by 5 from 1 to 100 :");
        divisibleBy5(1);
    }
    public static void divisibleBy3(int number) {
        if (number <= 100) {
            if (number % 3 == 0) {
                System.out.println(number + " ");
            }
            divisibleBy3(number + 1);
        }
    }
    public static void divisibleBy5(int number) {
        if (number <= 100) {
            if (number  %  5 == 0) {
                System.out.println(number + " ");
            }
            divisibleBy5(number + 1);
        }
    }
}



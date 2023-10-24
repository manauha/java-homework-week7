package homeworkweek7;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Programme17ArraySort {

    public static void main(String[] args) {
        int[] num = {20,48,16,83,91,27,64};
        System.out.println("Original Array Numbers are : " + Arrays.toString(num));

        Arrays.sort(num);
        System.out.println("Array numbers sorted in ascending order are :" + Arrays.toString(num));

        String[] wrd = {"Pen", "Pencil", "Paper", "Eraser", "Notepad", "Ruler"};
        System.out.println("Original String Array is :" + Arrays.toString(wrd));

        Arrays.sort(wrd);
        System.out.println("String Array sorted in ascending : " + Arrays.toString(wrd));
    }
}

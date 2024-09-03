package Chapter2_Arrays.SingleDimenArray;

import java.util.Scanner;

/*
🔸Given an array of marks of students, if the mark of any student is less than 35 print its roll number. [Here roll number
   refers to index value]
 */

public class Question_1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the number of students:");
            int n = sc.nextInt();

            int[] marks = new int[n]; // Taking input from keyboard for the memory allocation of array.

            System.out.println("Now enter the marks of students: ");

            // Taking input and storing marks inside the marks[] array.
            for (int i = 0; i <= n - 1; i++) {
                marks[i] = sc.nextInt();
            }

            // Iterating over an array and printing only those index values which are less
            // than 35 marks.
            System.out.print("The roll number of students who's marks are less than 35 are: ");

            for (int i = 0; i < marks.length; i++) {
                if (marks[i] < 35) {
                    System.out.print(i + "");
                }
            }
        }
    }

}

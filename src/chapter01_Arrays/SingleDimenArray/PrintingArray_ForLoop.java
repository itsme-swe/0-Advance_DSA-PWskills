package chapter01_Arrays.SingleDimenArray;

import java.util.Scanner;

public class PrintingArray_ForLoop {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];

            System.out.println("Enter the values to be stored inside array:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}

/*
 * Here we are using "for loop" to iterate over the whole array and printing the
 * array.
 */

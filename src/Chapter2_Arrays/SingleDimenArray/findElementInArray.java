package Chapter2_Arrays.SingleDimenArray;

import java.util.Scanner;

/*
 🔸Find the element 'x' in the array. Take array x as input. 
 */
public class findElementInArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the target value: ");
            int x = sc.nextInt();

            System.out.print("Enter the size of an array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter the elements of an array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false; // false stands for value not found

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    found = true; // true means value is present inside the array
                    break;
                }
            }

            if (found) {
                System.out.println("Element Found");
            } else {
                System.out.print("Element not found");
            }
        }
    }
}

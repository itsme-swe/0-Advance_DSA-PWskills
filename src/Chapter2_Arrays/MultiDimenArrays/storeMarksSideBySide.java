package Chapter2_Arrays.MultiDimenArrays;

import java.util.Scanner;

public class storeMarksSideBySide {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      int[][] students = new int[4][2];

      System.out.println("Enter the marks and roll numbers of students: ");

      // »» Taking Input
      for (int i = 0; i < students.length; i++) {
        for (int j = 0; j < students[0].length; j++) {
          students[i][j] = sc.nextInt();
        }
      }

      System.out.println();

      // »» Printing
      for (int i = 0; i < students.length; i++) {
        for (int j = 0; j < students[0].length; j++) {
          System.out.print(students[i][j] + " ");
        }
        System.out.println();
      }
    }
  }

}

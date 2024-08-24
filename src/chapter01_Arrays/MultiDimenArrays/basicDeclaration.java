package chapter01_Arrays.MultiDimenArrays;

import java.util.Scanner;

public class basicDeclaration {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      int[][] grid = new int[3][3];

      System.out.print("Enter the elements of 2D Array: ");

      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid.length; j++) {
          grid[i][j] = sc.nextInt();
        }
      }

      // Traversing through "for Each Loop"
      for (int[] row : grid) {
        for (int ele : row) {
          System.out.print(ele + " ");
        }
        System.out.println();
      }

      System.out.println();

      // »» Traversing through normal "for loop"
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid.length; j++) {
          System.out.print(grid[i][j] + " ");
        }
        System.out.println();

      }
    }

  }
}

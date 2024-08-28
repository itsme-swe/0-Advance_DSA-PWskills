package chapter01_Arrays.MultiDimenArrays;

/*
 * Write a program to add the two matrices.
 */
public class addTwoMatrices {

  public static void main(String[] args) {

    int[][] arr1 = { { 1, 9, 2 }, { 3, 7, 4 }, { 8, 5, 6 } };
    int[][] arr2 = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 6 } };

    int[][] resArr = new int[arr1.length][arr1[0].length];

    // 2️⃣ Printing an array using new array
    for (int i = 0; i < resArr.length; i++) {
      for (int j = 0; j < resArr[0].length; j++) {
        resArr[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    System.out.println("Sum of 2 Matrices with extra array: ");
    for (int[] row : resArr) {
      for (int ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }

    System.out.println();

    // 2️⃣ Printing without taking new array
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[0].length; j++) {
        arr1[i][j] += arr2[i][j];
      }
    }

    System.out.println("Sum of 2 Matrices without taking new array: ");
    for (int[] row : arr1) {
      for (int ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }

}

/*
 * 10 12 9
 * 11 13 9
 * 10 9 12
 */
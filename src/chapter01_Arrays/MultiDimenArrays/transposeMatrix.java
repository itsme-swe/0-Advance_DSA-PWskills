package chapter01_Arrays.MultiDimenArrays;

/*
💥 Write a program to print the transpose of the matrix entered by the user and store in the matrix. 

🔸Transpose means row ko column mae convert karnaya column ko row mae convert karna.
 */
public class transposeMatrix {

  public static void main(String[] args) {

    int[][] arr = { { 1, 3, 5 }, { 2, 4, 6 }, { 8, 9, 12 } };

    int m = arr.length;
    int n = arr[0].length;

    System.out.println("Original Array:");

    for (int[] row : arr) {
      for (int ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }

    System.out.println();

    int[][] transArr = new int[n][m];

    for (int j = 0; j < n; j++) {
      for (int i = 0; i < m; i++) {
        transArr[j][i] = arr[i][j];
      }
      System.out.println();
    }

    System.out.println("Array after transposing: ");
    for (int[] col : transArr) {
      for (int ele : col) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }
}

/*
 * Transposing kae liye khali humae outer loop joh 'i' kae liye chalta tha usae
 * aub 'j' kae liye chalayenge aur inner loop ko 'i' kae lie chalayenge, jissae
 * columns constantrahenge aur rows change hoti rahegi.
 */

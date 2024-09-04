package Chapter2_Arrays.MultiDimenArrays;

/*
🍁 Rotate an given Matrix by 90 degree clockwise.
 */
public class rotateMatrixClockwise {

  public static void main(String[] args) {

    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    printMatrix(arr);

  }

  public static void printMatrix(int[][] matrix) {

    transposeMatrix(matrix);

    for (int[] row : matrix) {
      for (int ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }

  public static void transposeMatrix(int[][] matrix) {

    int m = matrix.length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j <= i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    reverseMatrixRow(matrix);

  }

  public static void reverseMatrixRow(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {

      int a = 0;
      int b = matrix.length - 1;

      while (a < b) {
        int temp = matrix[i][a];
        matrix[i][a] = matrix[i][b];
        matrix[i][b] = temp;
        a++;
        b--;
      }

    }
  }
}

package Chapter2_Arrays.MultiDimenArrays;

/*
 * In this question we need to transpose the matrix without creating an new matrix.
 */
public class transformIntoTranspose {

  public static void main(String[] args) {

    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    printArray(matrix);

  }

  // »» Function to print array
  public static void printArray(int[][] arr) {

    transformToTranspose(arr);

    for (int[] row : arr) {
      for (int ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }

  // »» Function to transposeArray
  public static void transformToTranspose(int[][] matrix) {

    int m = matrix.length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j <= i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

}

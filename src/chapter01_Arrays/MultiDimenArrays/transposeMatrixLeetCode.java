package chapter01_Arrays.MultiDimenArrays;

/*
🍁 Given a 2D integer array matrix, return the transpose of matrix.

   The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

   LeetCode : https://leetcode.com/problems/transpose-matrix/description/
 */
public class transposeMatrixLeetCode {

  public static void main(String[] args) {

    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    for (int[] row : transpose(matrix)) {
      for (int ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }

  public static int[][] transpose(int[][] matrix) {

    int m = matrix.length;
    int n = matrix[0].length;

    int[][] transpose = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        transpose[i][j] = matrix[j][i];
      }
    }
    return transpose;
  }
}

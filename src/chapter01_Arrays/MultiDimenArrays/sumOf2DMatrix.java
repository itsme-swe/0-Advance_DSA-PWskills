package chapter01_Arrays.MultiDimenArrays;

public class sumOf2DMatrix {

  public static void main(String[] args) {

    int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

    int sum = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        sum += matrix[i][j];
      }
    }
    System.out.println("The sum of matrix is " + sum);
  }

}

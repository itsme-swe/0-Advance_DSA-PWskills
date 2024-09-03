package Chapter2_Arrays.MultiDimenArrays;

/*
 * Find the largest element of a given 2D array of Integers.
 */
public class largestEleIn2DArray {

  public static void main(String[] args) {

    int[][] arr = { { 1, 5, 7 }, { 2, -3, 6 }, { 2, 4, 5 } };

    int max = Integer.MIN_VALUE;

    int row = arr.length;
    int col = arr[0].length;

    // Yaha pae 'i' chalta hai row kae liye aur 'j' chalta hai columns kae liye
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        max = Math.max(max, arr[i][j]);
      }
    }
    System.out.println("The maximum element in 2D Array is " + max);
  }

}

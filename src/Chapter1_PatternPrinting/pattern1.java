package Chapter1_PatternPrinting;

/*
🔸 Print the pattern :

        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        
 */

public class pattern1 {

  public static void main(String[] args) {

    int[][] arr = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

    int m = arr.length;
    int n = arr[0].length;

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}

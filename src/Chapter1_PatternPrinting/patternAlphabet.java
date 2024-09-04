package Chapter1_PatternPrinting;

import java.util.Scanner;

/*
🔸 Print the following pattern:
 
      A A A A A
      B B B B B
      C C C C C
      D D D D D

*/
public class patternAlphabet {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the size of row: ");
      int row = sc.nextInt();

      System.out.println("Enter the size of column: ");
      int col = sc.nextInt();

      for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
          System.out.print((char) (i + 64) + " ");
        }
        System.out.println();
      }
    }
  }
}

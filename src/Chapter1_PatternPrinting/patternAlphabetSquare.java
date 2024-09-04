package Chapter1_PatternPrinting;

import java.util.Scanner;

/*
🔸 Print the following pattern: 

        A B C D E
        A B C D E
        A B C D E
        A B C D E

 */
public class patternAlphabetSquare {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of row: ");
      int row = sc.nextInt();

      System.out.print("Enter the size of column: ");
      int col = sc.nextInt();

      for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
          System.out.print((char) (j + 64) + " ");
        }
        System.out.println();
      }
    }
  }

}

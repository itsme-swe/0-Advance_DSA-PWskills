package Chapter1_PatternPrinting;

import java.util.Scanner;

/*
🔸 Print the following star pattern: 

      * 
      * *
      * * *
      * * * *

*/
public class patternStarTriangle {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of n: ");
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print('*' + " ");
        }
        System.out.println();
      }
    }
  }

}

/*
 * » Yaha pae hamara 'j' 'i' kae barabar chalega. Jaise jaise hamara 'i' change
 * hoga utnae star print karenge.
 */
package chapter01_Arrays.SingleDimenArray;

/*
 🔸Calculate the sum of all the elements in the given array.

  🔹Approach ↣ Array ko iterate karengae aur 1 extra variable laengae 'sum' name sae jisko initiate karenge 0 sae. Aur phir 
  condition kae andar array[i] ko sum mae plus karte jayenge.  
 */
public class Question_2 {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 10, 30, 18 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The sum of all array elements is: " + sum);

    }
}

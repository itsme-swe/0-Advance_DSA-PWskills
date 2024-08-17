package chapter01_Arrays.SingleDimensionalArray;

/*
🔸Given an integer array arr, rotate the array to the right by 'k' steps, where k is non-negative.
   Note: K can be greater than n as well where n is the size of array 'arr'.
   
   Leetcode :  https://leetcode.com/problems/rotate-array/description/   
 */
public class RotateArray {

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 70, 80, 90 };

    int k = 3;

    rotate(arr, k);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static void rotate(int[] a, int k) {
    int n = a.length;
    k = k % n; // iska mtlb hai agar kbhi 'k' kae value 'n' sae jaada hogi to mod karne sae 'k'
               // ki value 'n' sae kum ho jayegi
    reverse(a, 0, n - k - 1);
    reverse(a, n - k, n - 1);
    reverse(a, 0, n - 1);
  }

  public static void reverse(int[] nums, int i, int j) {
    while (i < j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
      j--;
    }
  }

}

/*
 * 🔸 Output : 70 80 90 10 20 30 40
 * 
 * 🔸Approach »» Ismae hum diye huae array ko 3 step mae break karengae
 * 1️⃣ Pheli baar hum "n - k" karenge jissae humae 'k' elements milenge
 * 2️⃣ Phir array ko 2 parts mae reverse karenge. Phela reverse hoga
 * "0 sae n-k-1" aur dusra reverse hoga "n-k sae n-1".
 * 3️⃣ Aur phir purae array ko reverse kardenge '0' sae 'n-1' tuk.
 */
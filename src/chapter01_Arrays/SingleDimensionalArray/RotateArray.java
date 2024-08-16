package chapter01_Arrays.SingleDimensionalArray;

/*
🔸Roate the give array 'a' by k steps, where k is non-negative without using extra space.
   Note: K can be greater than n as well where n is the size of array 'a'     
 */
public class RotateArray {

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 70, 80, 90 };

    int k = 3;

    RotateArray rotateArray = new RotateArray();
    rotateArray.rotate(arr, k);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public void rotate(int[] a, int k) {
    int n = a.length;
    k = k % n;
    reverse(a, 0, n - k - 1);
    reverse(a, n - k, n - 1);
    reverse(a, 0, n - 1);
  }

  public void reverse(int[] nums, int i, int j) {
    while (i < j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
      j--;
    }
  }

}

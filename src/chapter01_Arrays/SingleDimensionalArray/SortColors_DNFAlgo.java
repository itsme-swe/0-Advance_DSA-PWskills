package chapter01_Arrays.SingleDimensionalArray;

/*
🔸 Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

  We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

  You must solve this problem without using the library's sort function.

  Leetcode: https://leetcode.com/problems/sort-colors/description/?source=submission-ac
 */
public class SortColors_DNFAlgo {

  public static void main(String[] args) {

    int[] nums = { 2, 0, 2, 1, 1, 0 };

    sortColors(nums);

    for (int ele : nums) {
      System.out.print(ele + " ");
    }

  }

  public static void sortColors(int[] arr) {

    int n = arr.length;
    int low = 0;
    int mid = 0;
    int high = n - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
        low++;
        mid++;
      } else if (arr[mid] == 1)
        mid++;
      else {
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }

  }

}

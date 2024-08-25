package chapter01_Arrays.MultiDimenArrays;

public class basicInitilisation {

  public static void main(String[] args) {

    int[][] nums = { { 1, 2, 3 }, { 6, 4, 2 }, { 8, 10, 12 } };

    int row = nums.length;
    int column = nums[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    for (int[] rows : nums) {
      for (int ele : rows) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }

  }

}

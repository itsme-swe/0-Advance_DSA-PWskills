package chapter01_Arrays.SingleDimenArray;

/*
 🔸 Find the doublet in the array whose sum is equal to the given targetSum.
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 3, 4, 6, 8, 9 };

        int targetSum = 11;

        int n = arr.length;

        int[] sum = new int[2];

        boolean found = false; // Flag to break out of the outer loop

        // ◽Solution
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    sum[0] = arr[i];
                    sum[1] = arr[j];
                    found = true;
                    break;

                }
            }
            if (found)
                break; // Break out of the outer loop if a pair is found

        }

        if (found) {
            System.out.print("Pair found: " + sum[0] + " " + sum[1]);
        } else {
            System.out.println("Pair not found");
        }

    }

}

/*
 * 🔸Output : 2 is present at index 0 and 8 is present at index 3 and the time
 * complexity is O(n^2).
 */
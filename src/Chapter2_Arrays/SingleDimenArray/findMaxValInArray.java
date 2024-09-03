package Chapter2_Arrays.SingleDimenArray;

/*
 🔸Find the maximum value out of all the elements in the array 
 */
public class findMaxValInArray {
    public static void main(String[] args) {

        int[] arr = { 5, 10, 55, 125, 45, 105 };

        int max = Integer.MIN_VALUE;
        int indexValue = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // max = arr[i];
                max = Math.max(max, arr[i]); // Here we can use both the methods to store max value inside max variable
                indexValue = i;
            }
        }
        System.out.printf("The max value is %d present at index value %d", max, indexValue);
    }

}

/*
 * 🔸Output: The max value is 55 present at index value 2
 */
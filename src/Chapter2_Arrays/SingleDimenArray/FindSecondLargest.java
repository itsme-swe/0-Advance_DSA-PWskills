package Chapter2_Arrays.SingleDimenArray;

/*
 🔸Find the second largest element in the given array. 
 */
public class FindSecondLargest {

    public static void main(String[] args) {

        int[] arr = { 35, 55, 65, 50, 45 };
        int firstMaxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        int indexValue = -1;

        // Here we are traversing array to find first max value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMaxValue) {
                firstMaxValue = Math.max(firstMaxValue, arr[i]);
            }
        }

        // And, Here we are traversing array to find second max value and it's index
        // value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != firstMaxValue && arr[i] > secondMaxValue) {
                secondMaxValue = Math.max(secondMaxValue, arr[i]);
                indexValue = i;
            }
        }

        System.out.printf("The second max value is %d present at index value %d", secondMaxValue, indexValue);

    }

}

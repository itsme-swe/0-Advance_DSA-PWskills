package Chapter2_Arrays.SingleDimenArray;

/*
 🔸Write a program to reverse the array without using any extra space. 
 */
public class TwoPointerApproach {

    public static void main(String[] args) {

        int[] arr = { 30, 40, 50, 60, 80 };

        System.out.print("Array before reversing: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        int n = arr.length;

        int i = 0;
        int j = n - 1;

        swap(arr, i, j);

        System.out.print("Array after reversing: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}

/*
 * ↣ Two Pointer Approach
 * 1️⃣ Take 2 variables and initilise them with int i = 0; int j = n - 1;
 * "n stands for length of an array"
 * 2️⃣ Is approach mae joh condition banegi vo hai (i < j) aur jaise he 'i' 'j'
 * sae bada hoga vaise he loop break ho jayega.
 * 3️⃣ Aur phir condition kae anadr swap karne ki condition lagegi:
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] temp;
 * i++; "i ko aage badao";
 * j--; "j ko peeche lao";
 */

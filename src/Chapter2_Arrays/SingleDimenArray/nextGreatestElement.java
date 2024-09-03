package Chapter2_Arrays.SingleDimenArray;

/*
 * Find next greatest element.
 */
public class nextGreatestElement {

  public static void main(String[] args) {

    int[] arr = { 12, 5, 10, 15, 14, 11 };

    int n = arr.length;

    // 🔸Brute Approach
    int[] newArr = new int[n];
    newArr[n - 1] = -1;

    for (int i = 0; i < n - 1; i++) {
      int mx = Integer.MIN_VALUE;
      for (int j = i + 1; j < n; j++) {
        mx = Math.max(mx, arr[j]);
      }
      newArr[i] = mx;
    }

    System.out.print("Brute Force Method: ");
    for (int ele : newArr) {
      System.out.print(ele + " ");
    }

    System.out.println();

    // 🔸Optimized Approach
    int nge = arr[n - 1]; // "nge" stands for nextGreatestElement

    for (int i = n - 2; i <= 0; i--) {
      newArr[i] = nge;
      nge = Math.max(nge, arr[i]);
    }

    System.out.print("Optimized Approach: ");
    for (int ele : newArr) {
      System.out.print(ele + " ");
    }

    // »» Output: 15 15 15 14 11 -1

  }

}

/*
 * 🔺 Approach :
 * 1️⃣ Sabse phele hum 1 variable laenge aur max value decide karenge joh hogi
 * hamre array ki last value "n-1" kyuki uskae aage koi greatest element hoga
 * nhi.
 * 
 * 2️⃣ Is baar hum array ko ulta iterate karenge joh ki start hoga "n-2" sae aur
 * 0 index value tuk jayega kyuki hum last element ko "-1" laekae chalte hai.
 * 
 * 3️⃣ Agar hum apne aaray ko ulta iterate karenge toh new array mae values bhi
 * usi tarah insert karenge isliye hamari newArray ki 'i' value hamra max hoga.
 * 
 * 4️⃣ Aub jaise jaise hum iterate karte jayenge vaise vaise 'i' ki value ko
 * phele aur uskae sath apne max ko bhi update karte jayenge.
 * 
 */

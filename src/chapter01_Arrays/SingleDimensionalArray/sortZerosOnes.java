package chapter01_Arrays.SingleDimensionalArray;

/*
 🔸 Sort the array of 0's and 1's.
 */
public class sortZerosOnes {

  public static void main(String[] args) {

    int[] arr = { 1, 0, 0, 1, 1, 0, 0, 0, 1 };

    int n = arr.length;

    // »» Two Pass Solution means traversing array two times and time complexity
    // O(n).

    int noOfZeros = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        noOfZeros++;
      }
    }

    for (int i = 0; i < n; i++) {
      if (i < noOfZeros) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }

    System.out.print("Brute force: ");
    for (int ele : arr) {
      System.out.print(ele + " ");
    }

    System.out.println();

    // »» One Pass Solution means traversing array only one time and using "two
    // pointer approach".

    int i = 0;
    int j = n - 1;

    while (i < j) {
      if (arr[i] == 0) {
        i++;
      } else if (arr[j] == 1) {
        j--;
      } else if (arr[i] == 1 && arr[j] == 0) {
        arr[i] = 0;
        arr[j] = 1;
        i++;
        j--;
      }
    }

    System.out.print("Optimized Code: ");
    for (int ele : arr) {
      System.out.print(ele + " ");
    }

  }

}

/*
 * 🔸 Is ques mae hum two approaches use kar rahe hai. Pheli hai
 * "Two pass approach" yani hum array ko two times traverse karaenge aur
 * doosri approach hai "One Pass Approach" jismae hum sirf 1 baar traverse
 * karenge, jiskae liye hum hamari "two
 * pointer approach" ka istamal karengae.
 * 
 * Toh hum sirf "One Pass" discuss karenge. Toh chalo shuru kare:
 * 1️⃣ Do variable laenge "int i = 0" aur dusra "int j = n-1" »» yani ki 'i'
 * starting index aur 'j' last index array ka.
 * 2️⃣ Phir condition lagegi (i < j) »» yani ki 'i' jub tuk 'j' sae chota hai
 * tub tuk loop chalega.
 * 3️⃣ Loop kae andar pheli joh condition hai "if (arr[i] == 0) =++" »» yani ki
 * agar array ki pheli value 0 hai toh 'i' ko aage badao,
 * joh dusri condition hai "else if(arr[j] == 1)" »» yani ki agar array ki last
 * value pae 1 hai toh 'j' ko left ki taraf move karo
 * aur akhri condition hai "else if(arr[i] == 1 && arr[j] == 0)" »» yani agar
 * array ki second value 1 hai aur array ki second last value 0 hai toh
 * arr[i] mae 0 store karo aur arr[j] mae 1 ya phir swap kara do values ko. Aur
 * last mae i++ karo aur j-- karo.
 * 
 */
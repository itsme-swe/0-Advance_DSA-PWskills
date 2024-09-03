package Chapter2_Arrays.SingleDimenArray;

/*
🔺 Merge two sorted Arrays 
 */
public class mergeTwoSortedArrays {

  public static void main(String[] args) {

    int[] a = { 11, 33, 42, 71 };

    int[] b = { 26, 54, 69, };

    int[] c = new int[a.length + b.length];

    int i = 0;
    int j = 0;
    int k = 0;

    // Yae hai 2 arrays ko merge karne ki condition
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        c[k] = a[i];
        i++;
      } else {
        c[k] = b[j];
        j++;
      }
      k++;
    }

    // Yae condition lagegi jub agar hamare kisi bhi 1 array ki length dusrae array
    // sae agar choti ho.
    if (i == a.length) {
      while (j < b.length) {
        c[k] = b[j];
        j++;
        k++;
      }
    }

    if (j == b.length) {
      while (i < a.length) {
        c[k] = a[i];
        i++;
        k++;
      }
    }

    for (int ele : c) {
      System.out.print(ele + " ");
    }

  }

}
/*
 * 🟡 Output »» 11 26 33 42 54 69 71
 * 
 * 💥 Approach »»
 * 1️⃣ Sabse phele hame 1 khali array chaiye hoga jiski length diye huae arrays
 * ki length hogi.
 * 
 * 2️⃣ Phir hamae 3 variable laene hongae jo '0' sae start honge.
 * [ int i = 0, j = 0, k = 0 ] »» 'i' denote karega phele array ko 'j' karega
 * dusre array ko sur 'k' karega final array ko jismae values insert karenge.
 * 
 * 3️⃣ Phir hum dono arrays ko compare karna shuru karenge 'a[i]' ko aur 'b[j]'
 * hum dekhenge agar 'a[i]' chota hai 'b[j]' sae toh hum 'a[i]' ko new array mae
 * insert karenge aur phir 'i' ko aaage badayenge aur 'k' ko bhi . Aur agar
 * 'a[i]' bada hai
 * 'b[j]' sae toh hum new array mae b[j] ko insert karenge, aur 'j' ko aage
 * badayenge aur 'k' ko bhi.
 * 
 * 4️⃣ But phir hamae yae bhi dekhna hoga agar dono array mae kisi 1 ki length
 * kum hui toh upper vali given condition break ho jayegi. Phir uskae liye bhi
 * hame condition likhni hogi, agar 'i' barabar ho jaye apne array ki length sae
 * iska matlab ki 'i' vales insert ho chuki hai toh jo dusrae array ki bachi hui
 * values ko aub insert kardo baki kae aaray mae.
 * 
 */
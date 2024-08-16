package chapter01_Arrays.ArrayList;

import java.util.ArrayList;

public class BasicOfArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 15);
        arr.add(3, 40);
        arr.add(4, 30);
        arr.add(5, 25);

        for (Integer ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        System.out.println(arr); // 🔸Output: [10, 20, 15, 40, 30, 25]
    }

}

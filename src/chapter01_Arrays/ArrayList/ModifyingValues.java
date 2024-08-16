package chapter01_Arrays.ArrayList;

import java.util.ArrayList;

public class ModifyingValues {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0, 5);
        arr.add(1, 10);
        arr.add(2, 15);
        arr.add(3, 25);
        arr.add(4, 30);

        // Iterating over ArrayList
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        arr.set(3, 20); // Used to modify the values of list

        System.out.println(arr);
    }

}

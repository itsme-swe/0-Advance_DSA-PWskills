package chapter01_Arrays.SingleDimenArray;

public class PassingArrayToMethod {

    public static void main(String[] args) {

        int[] x = { 10, 30, 40, 50 };
        System.out.println(x[0]);
        change(x);
        System.out.println(x[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 90;
    }

}

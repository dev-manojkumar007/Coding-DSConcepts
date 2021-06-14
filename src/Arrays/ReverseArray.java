package Arrays;

/**
 * Created by dev-manojkumar007 on 14 Jun, 2021
 * Reverse an Array
 */
public class ReverseArray {

    public static void reverseArray(int[] arr, int start, int end) {

        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

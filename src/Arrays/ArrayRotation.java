package Arrays;
import java.util.Scanner;

/**
 * Created by dev-manojkumar007 on 14 Jun, 2021
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 1<=D<=N
 */
public class ArrayRotation {

    public static void rotateTheArray_Method1(int[] arr, int d) {

        int[] temp = new int[arr.length];
        int index = 0;

        for(int i=0; i<arr.length; i++){

            if((i+d) < arr.length) {
                temp[i] = arr[i+d];
            }
            else {
                temp[i] = arr[index++];
            }
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(temp[i]+" ");
    }

    static void rotateTheArray_Method2(int[] arr, int d) {

        if(d==0)
            return;

        int length = arr.length;
        ReverseArray.reverseArray(arr,0,d-1);
        ReverseArray.reverseArray(arr,d,length-1);
        ReverseArray.reverseArray(arr,0,length-1);

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

    }

}

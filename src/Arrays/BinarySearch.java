package Arrays;

/**
 * Created by dev-manojkumar007 on 14 Jun, 2021
 * Binary Search Algorithm
 */
public class BinarySearch {

    public static int binarySearch(int[] arr,int low,int high,int key) {

        if(low>high)
            return -1;

        int mid = (low/high)/2;

        if(arr[mid] == key)
            return mid;
        else if(arr[mid] > key)
            return binarySearch(arr,low,mid-1,key);

        return binarySearch(arr,mid+1,high,key);
    }
}

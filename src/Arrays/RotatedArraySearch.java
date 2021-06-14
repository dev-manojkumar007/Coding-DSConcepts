package Arrays;

/**
 * Created by dev-manojkumar007 on 14 Jun, 2021
 *
 * Given a sorted and rotated array A of N distinct elements which is rotated at some point,
 * and given an element key. The task is to find the index of the given element key in the array A.
 */
public class RotatedArraySearch {

    public static int searchInRotatedArray(int[] A, int l, int h, int key) {

        int pivot = findPivot(A,l,h);

        if(pivot == -1)
            return BinarySearch.binarySearch(A,l,h,key);

        if(A[pivot] == key)
            return pivot;
        if(A[l]<=key)
            return BinarySearch.binarySearch(A,l,pivot-1,key);

        return BinarySearch.binarySearch(A,pivot+1,h,key);
    }

    static int findPivot(int[] A, int low, int high) {

        if(high<low)
            return -1;

        if(low == high)
            return low;

        int mid = (low+high)/2;

        if(mid<high && A[mid]>A[mid+1])
            return mid;
        if(mid>low && A[mid]<A[mid-1])
            return mid-1;
        if(A[low]>=A[mid])
            return findPivot(A,low,mid-1);

        return findPivot(A,mid+1,high);
    }
}

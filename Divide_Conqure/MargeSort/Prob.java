import java.util.*;

public class Prob {

    public static void margesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // find the midpoint
        int mid = si + (ei - si) / 2;
        margesort(arr, si, mid); // left part
        margesort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei); // merge both parts
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // temporary array
        int i = si; // iterator for left part
        int j = mid + 1; // correct iterator for right part
        int k = 0; // iterator for temp array

        // merging both halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // copying remaining elements from left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // copying remaining elements from right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copying temp array to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        margesort(arr, 0, arr.length - 1);
        printarr(arr); // prints sorted arry
    }
}

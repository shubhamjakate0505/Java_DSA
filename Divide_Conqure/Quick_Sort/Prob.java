import java.util.*;

public class Prob {

    public static void Quicsort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei); // partition the array
        Quicsort(arr, si, pidx - 1); // sort left part
        Quicsort(arr, pidx + 1, ei); // sort right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // choose pivot as the last element
        int i = si - 1; // index for the smaller element

        for (int j = si; j < ei; j++) { // loop until before pivot
            if (arr[j] <= pivot) { // if current element is less than or equal to pivot
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place the pivot element in its correct sorted position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // return the pivot index
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        printarr(arr); // print original array
        Quicsort(arr, 0, arr.length - 1); // sort array
        printarr(arr); // print sorted array
    }
}

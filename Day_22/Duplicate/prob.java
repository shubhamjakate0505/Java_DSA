import java.util.*;

public class prob {
    public static int removedublicate(int arr[]) {
        int k = 1;
        for (int i = 1; i < arr.length; i++) { // Fix loop to iterate through entire array
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k; // k is the new length of the array without duplicates
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 1, 1};

        // Optionally sort array if not sorted
        Arrays.sort(arr);  // Sorting ensures duplicate elements are adjacent

        int newLength = removedublicate(arr);

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

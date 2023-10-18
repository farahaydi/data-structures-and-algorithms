
package mergesort;

import static mergesort.MergeSort.mergeSort;

public class App {


    public static void main(String[] args) {

        int[] arr = {8,4,23,42,16,15};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

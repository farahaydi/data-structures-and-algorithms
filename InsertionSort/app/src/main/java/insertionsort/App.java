
package insertionsort;

public class App {

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};
        Insertion.insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class class03 {
    public static void main(String[] args) {

        int array []={-131, -82, 0, 27, 42, 68, 179};
        int key = 42;
        //===========================================================

        int result = binarySearch(array, key);
        if (result != -1) {
            System.out.println("Index Of Array Equal To Key "+key+" Is "+result);
        } else {
            System.out.println(key +" Is Not Found");
        }
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        int array2 []={11, 22, 33, 44, 55, 66, 77};
        int key2=90 ;

        System.out.println();
        //===========================================================

        int result2 = binarySearch(array2, key2);
        if (result2 != -1) {
            System.out.println("Index Of Array Equal To Key "+key2+" Is "+result2);
        } else {
            System.out.println(key2 +" Is Not Found");
        }


    }
    public static int binarySearch (int[] sortedArray, int key)
    {
        //1- sort Array
        int temp = 0;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(sortedArray));

        //2- use binary searcj to find key
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;

        while (low <= high) {

            mid = low + (high - low) / 2;

            if (sortedArray[mid] == key) {
                return mid;
            }

            else if (key > sortedArray[mid]) {
                low = mid + 1; //search on right side
            }

            else {
                high = mid - 1; // Search on left side
            }
        }

        return -1; // key not on this array
    }

}

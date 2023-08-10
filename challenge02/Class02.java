import java.util.Arrays;

public class Class02 {
    public static void main(String[] args) {
        int[] oddArray = {1, 2, 3, 4, 5};
        int[] evenArray = {1, 2, 3, 4, 5, 6};
        int valueToInsert = -9;

        int[] resultOdd = insertShiftArray(valueToInsert, oddArray);
        int[] resultEven = insertShiftArray(valueToInsert, evenArray);

        System.out.println("Odd Array:");
        for (int num : resultOdd) {
            System.out.print(num + " ");
        }

        System.out.println("\nEven Array:");
        for (int num : resultEven) {
            System.out.print(num + " ");
        }

    }

    public static int[] insertShiftArray(int n, int list[]) {
        int middleIndex = list.length / 2;
        int[] result = new int[list.length + 1];
        if (list.length % 2 == 0) {
            for (int i = 0; i < middleIndex; i++) {
                result[i] = list[i];
            }
            result[middleIndex] = n;
            for (int i = middleIndex + 1; i <= list.length; i++) {
                result[i] = list[i - 1];
            }
        } else {
            for (int i = 0; i < middleIndex; i++) {
                result[i] = list[i];
            }
            result[middleIndex] = n;
            for (int i = middleIndex + 1; i <= list.length; i++) {
                result[i] = list[i - 1];
            }
        }

        return result;
    }
}

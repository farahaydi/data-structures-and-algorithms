import java.util.Arrays;

public class Class01 {
        public static void main(String[] args)
        {
            int testArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] reversedArray = reverseArray(testArray);
            System.out.println(Arrays.toString(reversedArray));
        }
        public static int[] reverseArray(int array[])
        {
            int arrayLength = array.length;
            int[] result = new int[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                result[arrayLength - i - 1] = array[i];
            }

            return result;
        }
}

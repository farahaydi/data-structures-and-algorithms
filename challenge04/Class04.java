import java.util.Arrays;

public class Class04 {
    public static int FibonacciSequence01 (int n) // if i enter n=7 [0,1   ,1,2,3,5,8,13...]
    {
        int index0= 0;
        int index1=1;
        for(int i=2; i<=n ;i++)
        {
            int looping =index0+index1;
            index0=index1;
            index1=looping;
        }
        return index1;

    } //return array[n]
    public static int FibonacciSequence02 (int n)
    {
        if (n <= 1) {
            return n;
        }
        return FibonacciSequence02(n-1)+FibonacciSequence02(n-2);
    }

    public static int[] matrixSummation (int[][] matrix)
    {
        int array[]=new int [matrix.length];
        for (int i =0 ; i<matrix.length; i++)
        {
            int summation =0;
            for (int j =0 ; j< matrix[i].length; j++)
            {

                summation+=matrix[i][j];

            }
//            System.out.print(summation+" ");
            array[i]=summation;

//            System.out.println();
        }
        return array;
    }

    public static void main(String[] args)
    {
        System.out.println(FibonacciSequence01(6));
        System.out.println(FibonacciSequence02(45));

        int[][] matrix = {
                {1, 2, 3},
                {3,5,7},
                {1,7,10}
        };

        System.out.println(Arrays.toString(matrixSummation(matrix)));
    }
}

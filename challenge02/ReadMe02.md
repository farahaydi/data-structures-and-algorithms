# Code Challenge: Class 02
in this challenge we just deifined a function called **insertShiftArray** which takes an array and number as an argument and return an array with the new value added at the middle index.
## Whiteboard Process
[Whiteboard](./Screenshot%20(395).png)

## Approach & Efficiency
Approach: The code defines an ArrayList<Integer> and adds initial elements [10, 20, 30]. The insertShiftArray method takes an integer and the list, calculates the middle index, inserts the integer there, and returns the modified list.


## Solution

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

>The provided Java code defines a function called insertShiftArray, 
> which takes a value (n) and an integer array (list) as input. The function inserts the value at the middle index of the input array while shifting existing elements to accommodate the new value.
> It first calculates the middle index, creates a new array with one more element than the input array, and checks if the array has an even or odd length. Depending on the array length,
> the code shifts elements to make room for the new value at the middle index.
> The function then returns the resulting array. The main function demonstrates the usage of this insertShiftArray function on both odd-length and even-length arrays,
> showcasing the proper insertion of the new value while preserving the original element order.
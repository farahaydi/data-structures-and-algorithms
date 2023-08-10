# Code Challenge: Class 01
in this challenge we just deifined a function called **reverseArray** which takes an array as an argument and return an array with elements in reversed order.

## Whiteboard Process
[Whiteboard](./Screenshot%20(394).png)

## Approach & Efficiency
Approach:
The approach taken in the code is a simple iterative method to reverse the array. It initializes a new array called result of the same size as the input array and then iterates through the input array, placing the elements in reverse order into the result array.
Efficiency:


## Solution

    public static int[] reverseArray(int array[])
    {
        int arrayLength = array.length;
        int[] result = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            result[arrayLength - i - 1] = array[i];
        }

        return result;
    }


on this code i invoke the function reverseArray on main and sending an array to it , then store the calling of the array inside intrger array then print it using the Class Array with method **.toString()** It is used here to convert an array into a human-readable string representation.

on the function itself, we just create variable called arrayLength and store a length of array inside this variable, then i create a new array to store the result inside it and this array have the same length of array send as parameter, then i using a loop to looping inside array index by index, then give the resulte array of index **[arrayLength - i - 1]** (thats mean the last element of array) a value of array of index 0 . 
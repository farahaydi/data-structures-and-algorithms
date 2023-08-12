# Code Challenge: Class 03
> in this challenge we created a method called **BinarySearch** this method  takes in 2 parameters 'array, key' and return  index of the array’s element that is equal to the value of the search key or -1 if key Not Found on this array.


## Whiteboard Process
[WihteBoard Image](./Screenshot%20(405).png)
## Approach & Efficiency
**Approach:**
>The binary search algorithm is a divide-and-conquer search algorithm used to find a specific element (the "key") within a sorted array. The approach is based on repeatedly dividing the search range in half until the key is found or the search range is empty.


## Solution

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


>> If we want to use **Binry search** the data must be sorted so we use **Bubble Sort** it's the must easy type of sorting algorithm, then we stat with
>> binary search => we have Low ,high and mid
 - low => low index, first element on array
 - high => higher index, last element on array
 - mid => (low-high) /2    || low+(high-low)/2
> we divided our array from this mid,
> if key = mid then we find the index 'array[mid] == key => True',
> if key greter than mid =>
        1-we will search on right side of mid
        2-low = mid+1
        3- find mid again
>if key less than mid
        1-we will search on the left side of mid
        2- high = mid-1
        3- find mid again

> else we will return -1

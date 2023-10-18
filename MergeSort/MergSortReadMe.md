# MergSort
Merge Sort is a smart way to sort things. It breaks the list into small parts, sorts them, and then puts them back together. It's super efficient!
# pseudocode
MergeSort(arr[], left, right)
if left < right
1. Find the middle point to divide the array into two halves:
mid = left + (right - left) / 2

        2. Call MergeSort for the first half:
           MergeSort(arr, left, mid)

        3. Call MergeSort for the second half:
           MergeSort(arr, mid + 1, right)

        4. Merge the two halves sorted in step 2 and 3:
           merge(arr, left, mid, right)

Merge(arr[], left, mid, right)
1. Calculate the sizes of the two subarrays to be merged:
n1 = mid - left + 1
n2 = right - mid

    2. Create temporary arrays leftArray[] and rightArray[]

    3. Copy data to temporary arrays leftArray[] and rightArray[]:
       for i = 0 to n1
           leftArray[i] = arr[left + i]
       for j = 0 to n2
           rightArray[j] = arr[mid + 1 + j]

    4. Merge the two arrays:
       i = 0, j = 0, k = left
       while i < n1 and j < n2
           if leftArray[i] <= rightArray[j]
               arr[k] = leftArray[i]
               i++
           else
               arr[k] = rightArray[j]
               j++
           k++

    5. Copy remaining elements if any:
       while i < n1
           arr[k] = leftArray[i]
           i++
           k++
       while j < n2
           arr[k] = rightArray[j]
           j++
           k++

# Trace 
![tracMerge](./Screenshot%202023-10-18%20194106.png)

# Efficency
Time Complexity: O(n log n)
Space Complexity: O(n)

# Binry search data must be sorted so we use bubble sort it's the must easy type of sorting algorithm, then we stat with
binary search =>
1- we have Low ,high and mid
low => low index ''
high => higher index
mid => (low-high) /2    || low+(high-low)/2
        we divided our array from this mid,if key = mid then we find it ,


        // high >low
        //low <= high

        >if key greter than mid =>
        1-we will search on right side of mid
        2-low = mid+1
        3- find mid again


        >if key less than mid
        1-we will search on the left side of mid
        2- high = mid-1
        3- find mid again

        >else we will return -1



beacuas array is sorted so if the key greter than mid, then we will search just
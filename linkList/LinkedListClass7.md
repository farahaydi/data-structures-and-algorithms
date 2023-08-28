# Linked List Challenge 07
we complete buliding LinkedList in this cc we start bulding new 1 method
- kthFromEnd 


## Whiteboard Process
[linkedList](./Screenshot%20(431).png)

## Approach & Efficiency
The provided code implements a kthFromEnd method in the Linkylist class to find the kth value from the end of a linked list. It does so by first calculating the length of the list in one pass and then determining the position of the desired value from the start. It then traverses the list again to reach the calculated position and returns the value at that node. The approach involves two passes, resulting in a time complexity of O(n) and constant space complexity. A more optimized approach using the two-pointer technique could achieve the same goal with a single pass.

## Solution
```Java
package linklist;

public class Linkylist {
    public Node head;
    public Linkylist()
    {
        this.head=null;
    }
    public int kthFromEnd(int k) {
        if (head == null || k < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.nextValue;
        }

        if (k >= size) {
            throw new NullPointerException("k is equal to or larger than the list size");
        }
        Node first = head;
        Node second = head;

        for (int i = 0; i < k; i++) {
            if (second == null) {
                throw new IllegalArgumentException("k is larger than the list size");
            }
            second = second.nextValue;
        }

        while (second.nextValue != null) {
            first = first.nextValue;
            second = second.nextValue;
        }

        return first.value;
    }
}
```
Linkylist test = new Linkylist();

// kthFromEnd
test.insert(2);
test.insert(8);
test.insert(3);
test.insert(1);
linkedList.kthFromEnd(2)
==> the output here will be 3




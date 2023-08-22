# Linked List Challenge 06
we complete buliding LinkedList in this cc we start bulding new 1 method
- kthFromEnd 


## Whiteboard Process
[linkedList](./Screenshot%20(427).png)

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
        int length = 0;
        Node currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.nextValue;
        }
        int positionFromStart = length - k;
        if (positionFromStart < 0) {
            return -1;
        }
        currentNode = head;
        for (int i = 0; i < positionFromStart; i++) {
            currentNode = currentNode.nextValue;
        }

        return currentNode.value;
    }
}
```
Linkylist linkedList = new Linkylist();

// kthFromEnd
myList.insert(5);
myList.insert(15);
myList.insert(25);
myList.insert(35);
myList.insert(45);
myList.insert(55);
linkedList.kthFromEnd(1)
==> the output here will be 5




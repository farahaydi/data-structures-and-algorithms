# Code Challenge: Class 08
in this challenge we crete new method called **zipLists** this method take 2 argument type of LinkedList, then merge these 2 linkedlist together and return a zipped list.

## Whiteboard Process
[whiteboard08](./Screenshot%20(432).png)

## Approach & Efficiency
Approach
Initialize pointers firstNode and secondNode to the heads of linky1 and linky2.
Create a dummy Node named zippedNode with a value of -1 to simplify zipped list creation.
Initialize a current pointer to the dummy zippedNode.
Enter a loop while both firstNode and secondNode are not null:
Store the next nodes in next1 and next2 to temporarily hold the next nodes of firstNode and secondNode.
Connect current.nextValue to firstNode and move current to the next node (current = current.nextValue).
Connect current.nextValue to secondNode and again move current to the next node.
Update firstNode and secondNode to their next nodes (next1 and next2).
After the loop, handle remaining nodes:
If there are remaining nodes in firstNode, connect them to the end of the zipped list using current.nextValue.
If there are remaining nodes in secondNode, similarly connect them to the end of the zipped list.
Return the zipped list by skipping the dummy node and returning zippedNode.nextValue.
Efficiency:

Time Complexity: The algorithm iterates through both input lists once, performing constant-time operations within the loop. Therefore, the time complexity is O(N), where N is the total number of nodes in the longer of the two input lists.
Space Complexity: The algorithm uses a constant amount of extra space to hold temporary variables and pointers. The space complexity is O(1).

## Solution
```Java
package linklist;

public class Linkylist {
    public Node head;

    public Linkylist() {
        this.head = null;
    }

    public Node zipLists(Linkylist linky1, Linkylist linky2) {
        Node firstNode = linky1.head;
        Node secondNode = linky2.head;
        Node zippedNode = new Node(-1);
        Node current = zippedNode;
        while (firstNode != null && secondNode != null) {
            Node next1 = firstNode.nextValue;
            Node next2 = secondNode.nextValue;
            current.nextValue = firstNode;
            current = current.nextValue;
            current.nextValue = secondNode;
            current = current.nextValue;
            firstNode = next1;
            secondNode = next2;
        }
        if (firstNode != null) {
            current.nextValue = firstNode;
        } else {
            current.nextValue = secondNode;
        }
        return zippedNode.nextValue;
    }
}
```
Linkylist test1 = new Linkylist();
test1.insert(2);
test1.insert(3);
test1.insert(1);

        Linkylist test2 = new Linkylist();
        test2.insert(4);
        test2.insert(9);
        test2.insert(5);

        Node zippedList = test1.zipLists(test1, test2);
        System.out.println("Zipped List: ");
        System.out.println(printToString(zippedList));

> we create 2 linkedList (test1, test2) and insert some number on each one of these list.
> we create an object from Node class called zippedList then call the method zipLists .
> zipLists method take 2 argument from type LinkedList then merge these 2 linkedlist in one linked list.
> we print the new list that contain 2 list.

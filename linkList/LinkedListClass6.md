# Linked List Challenge 06
 we complete buliding LinkedList in this cc we start bulding new 3 method 
 - append to add at the end of list 
 - insertBefore to add new element before spicefic element
 - insertAfter to add new element after spicefic element

## Whiteboard Process
[linkedList](./Screenshot%20(426).png)

## Approach & Efficiency
Append: Traverse the list to find the last node, then add a new node with the provided value to the end.

Insert Before: Insert a new node with a specified value before a matching node. If the list is empty, the new node is the head. Traverse to find the node before the target value and insert the new node there.

Insert After: Insert a new node with a given value after a matching node. Locate the target value and insert the new node right after.

Efficiency:

All three methods, append, insertBefore, and insertAfter, have a time complexity of O(n) in the worst case, where n is the number of nodes in the linked list. This is due to the need to traverse the list to find the appropriate insertion points.
The space complexity for these methods is O(1), indicating that they use a constant amount of additional memory regardless of the input size.
It's important to note that while the provided code implements the desired functionality, there might be opportunities for further optimization based on specific use cases or requirements.  


## Solution
```Java
package linklist;

public class Linkylist {
    public Node head;
    public Linkylist()
    {
        this.head=null;
    } 
    public void append(int value) {
        Node heady = head;
        while (heady != null) {
            if (heady.nextValue == null) {
                break;
            }
            heady = heady.nextValue;
        }

        Node newVaule = new Node(value);
        if (heady == null) {
            head = newVaule;
        } else {
            heady.nextValue = newVaule;
        }
    }

    public void insertBefore(int value, int newValue) {
        if (head == null) {
            return;
        }

        if (head.value == value) {
            Node newNode = new Node(newValue);
            newNode.nextValue = head;
            head = newNode;
            return;
        }

        Node heady = head;
        while (heady.nextValue != null) {
            if (heady.nextValue.value == value) {
                Node newNode = new Node(newValue);
                newNode.nextValue = heady.nextValue;
                heady.nextValue = newNode;
                return;
            }
            heady = heady.nextValue;
        }
    }

    public void insertAfter(int value, int newValue) {
        if (head == null) {
            return;
        }
        Node heady = head;
        while (heady != null) {
            if (heady.value == value) {
                Node newNode = new Node(newValue);
                newNode.nextValue = heady.nextValue;
                heady.nextValue = newNode;
                return;
            }
            heady = heady.nextValue;
        }
    }

}
```
Linkylist linkedList = new Linkylist();

// Appending nodes
linkedList.append(10);
linkedList.append(20);
linkedList.append(30);
==> here we add 3 nuber at the end of list

// Inserting before a value
linkedList.insertBefore(20, 15);  
==> here we add number 15 before index have 20 value

// Inserting after a value
linkedList.insertAfter(20, 25);   
==> here we add number 25 after index have 20 value



# Code Challenge: Class 11
The PseudoQueue class is a Java implementation of a queue using two linked stacks (FistStack and SecondStack).
It allows for adding elements to the end of the queue and extracting elements from the front, following the first-in, first-out (FIFO) principle. 
This efficient structure maintains the queue behavior using two stacks.

## Whiteboard Process
[PseduQueue](./img.png)

## Approach & Efficiency
Enqueue Operation:

When an element is enqueued, it is simply pushed onto FistStack. This operation has a time complexity of O(1) since pushing onto a stack is an efficient constant-time operation.
The space complexity for the enqueue operation is also O(1) because it only involves adding one element to the stack.
Dequeue Operation:

The dequeue operation checks whether both FistStack and SecondStack are empty. If they are, it throws an exception, which is an O(1) operation.
If SecondStack is empty, elements are transferred from FistStack to SecondStack. This transfer operation has a time complexity of O(N), where N is the number of elements in FistStack. However, this transfer occurs only once per element in the PseudoQueue, making it an amortized O(1) operation for each dequeue.
Popping an element from SecondStack (representing the front of the queue) is an O(1) operation.
The space complexity for the dequeue operation is O(1) because it doesn't create any new data structures.

## Solution

```
public class PseudoQueue {
    public LinckedStack FistStack ;
    public LinckedStack SecondStack;
    public int length;

    public PseudoQueue() {
        this.FistStack = new LinckedStack();
        this.SecondStack = new LinckedStack();
    }
    //enqueue
    //Arguments: value
    //Inserts a value into the PseudoQueue, using a first-in, first-out approach.
     public void enqueue(int value) {
        Node newNode = new Node(value); //20-15
        while (!FistStack.isEmpty()) {
            SecondStack.push(FistStack.pop()); //Second ->20
        }
        FistStack.push(newNode.item); //First -> 15-20
        while (!SecondStack.isEmpty()) {
            FistStack.push(SecondStack.pop());
        }
        length++;
    }
    //dequeue
    //Arguments: none
    //Extracts a value from the PseudoQueue, using a first-in, first-out approach.
    public int dequeue()
    {
        if (FistStack.isEmpty() && SecondStack.isEmpty())
        {
            throw new IllegalArgumentException("The PseudoQueue is empty");
        }
        if(SecondStack.isEmpty())
        {
             SecondStack.push(FistStack.pop());
        }
            return SecondStack.pop();

    }
```
1- // Create a PseudoQueue instance
PseudoQueue pseudoQueue = new PseudoQueue();
2- // Enqueue some elements
pseudoQueue.enqueue(1);
pseudoQueue.enqueue(2);
pseudoQueue.enqueue(3);
3- // Dequeue and print elements
System.out.println(pseudoQueue.dequeue()); // Should print 1
System.out.println(pseudoQueue.dequeue()); // Should print 2

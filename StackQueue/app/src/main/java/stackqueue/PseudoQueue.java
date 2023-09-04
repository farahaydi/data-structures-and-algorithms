package stackqueue;

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
        if (FistStack.isEmpty() || SecondStack.isEmpty())
        {
            throw new IllegalArgumentException("The PseudoQueue is empty");
        }
        if(SecondStack.isEmpty())
        {
             SecondStack.push(FistStack.pop());
        }
            return SecondStack.pop();

    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Queue: ");
        LinckedStack tempStack = new LinckedStack();

        while (!SecondStack.isEmpty()) {
            tempStack.push(SecondStack.pop());
        }

        while (!tempStack.isEmpty()) {
            int item = tempStack.pop();
            result.append(item).append(" ");
            SecondStack.push(item);
        }

        while (!FistStack.isEmpty()) {
            tempStack.push(FistStack.pop());
        }

        while (!tempStack.isEmpty()) {
            int item = tempStack.pop();
            result.append(item).append(" ");
            SecondStack.push(item);
        }
        return result.toString();
}



}

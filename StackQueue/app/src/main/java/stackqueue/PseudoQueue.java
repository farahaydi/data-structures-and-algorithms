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
    public void enqueue(int value)
    {
        Node newValue = new Node(value);
        FistStack.push(newValue.item);
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



}

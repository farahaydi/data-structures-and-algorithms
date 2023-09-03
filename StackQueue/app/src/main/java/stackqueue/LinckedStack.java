package stackqueue;

public class LinckedStack {
    public Node top;
    public int length;

    public LinckedStack() {
        this.top = null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        if(this.top==null)
        {
            return true;
        }
        else
            return false;
    }
    public void push(int newValue) {
        Node newItem = new Node(newValue);
        newItem.next = this.top;
        this.top = newItem;
        length++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack Is Empty");
        }
        int removedValue = top.item;
        top = top.next;
        return removedValue;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException("Stack Is Empty");
        }
        return top.item;
    }
}

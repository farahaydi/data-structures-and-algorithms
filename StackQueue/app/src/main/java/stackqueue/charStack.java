package stackqueue;

public class charStack {
    public NodeChar top;
    public int length;

    public charStack() {
        this.top = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void push(char newValue) {
        NodeChar newItem = new NodeChar(newValue);
        newItem.next = this.top;
        this.top = newItem;
        length++;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack Is Empty");
        }
        char removedValue = top.item;
        top = top.next;
        length--;
        return removedValue;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack Is Empty");
        }
        return top.item;
    }
}

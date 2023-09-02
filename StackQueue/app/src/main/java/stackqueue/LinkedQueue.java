package stackqueue;

public class LinkedQueue {
    public Node head;
    public Node tail;
    public int length;

    public LinkedQueue() {
        this.head = null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        if(tail==null && head==null)
            return true;
        else
            return false;
    }
    public void enqueue(int newValue)
    {
        Node newItem=new Node(newValue);
        if(isEmpty())
        {
            tail=newItem;
            head=newItem;
        }
        else
        {
            tail.next=newItem;
            tail=tail.next;
        }
        length++;
    }
}

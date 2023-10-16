package linklist;

public class LinkedList {
    Node head;
    int size=0;
    public LinkedList()
    {
        this.head=null;
    }
    public boolean isEmpty()
    {
        if(head==null)
            return true;
        else return false;
    }
    public void insert(int item)
    {
        Node newNode =new Node(item);
        if(!isEmpty())//not empty
        {
            newNode.next=head;
            head=newNode;
        }
        else
        {
            head=newNode;
        }
        size++;
    }
    public boolean includs(int item){
        Node currentItem=head;
        while (currentItem!=null)
        {
            if(currentItem.item==item)
                return true;
            currentItem=currentItem.next;
        }
        return false;
    }

    //    append
//    arguments: new value
//    adds a new node with the given value to the end of the list
    //add to tail
//    public void append(int item)
//    {
//        Node newNode =new Node(item);
//        Node current=head;
//        while (current.next!=null)//not access the tail
//        {
//            current=current.next;
//        }
//        newNode.next=null;
//        current.next=newNode;
//        size++;
//    }
    public void append(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (isEmpty())
            head = newNode;
        else {
            Node current = head;
            while (current.next != null && current.next.item != value) {
                current = current.next;
            }
            if (current.next != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
        size++;
    }
    public void insertAfter(int item, int newItem)
    {
        Node newData=new Node(newItem);
        Node currentData=head;
        while (currentData.next!=null)
        {
            if (currentData.item==item)
            {
                newData.next=currentData.next;
                currentData.next=newData;
            }
            currentData=currentData.next;
        }
        size++;
    }
    public int indexAt(int index)
    {
        Node currentItem=head;
        if(index==0)
        {
            return head.item;
        }
        else if(index!=0)
        {
            for(int i=0; i<index && currentItem!=null;i++)
            {
                currentItem=currentItem.next;
            }
            return currentItem.item;
        }
        else
            return -1;
    }
    public int kth(int index)
    {
        size=size-1;
        int newIndex=size-index;
        Node current =head;
        if(newIndex==0)
        {
            return head.item;
        }
        else if(newIndex!=0){
            for(int i=0;i<index&& current!=null;i++)
            {
                current=current.next;
            }
            return current.item;
        }
        else{
            return -1;
        }

    }

    public LinkedList zipLists(LinkedList list1,LinkedList list2)
    {
        LinkedList newList =new LinkedList();
        Node currentL1=list1.head;
        Node currentL2=list2.head;
        while (currentL1!=null || currentL2!=null)
        {
            newList.append(currentL1.item);
            newList.append(currentL2.item);
            currentL1=currentL1.next;
            currentL2=currentL2.next;
        }
        return newList;
    }
    public LinkedList reverseList()
    {
        LinkedList reversedList=new LinkedList();
        Node current=head;

        while (current!=null)
        {
            reversedList.insert(current.item);
            current=current.next;
        }
        return reversedList;
    }

    public int findMid()
    {
        Node current =head;
        int count=0;
        int mid=size/2;
        while (current.next!=null)
        {
            if(count==mid)
                return current.item;
            current=current.next;
            count++;
        }
        return -1;
    }
    public int numberOccurs(int key){
        Node current =head;
        int count=0;
        while(current!=null)
        {
            if(key==current.item)
            {
                count++;
            }
            current=current.next;

        }
        return count;
    }

    //How are duplicate nodes removed in an unsorted linked list?
    public LinkedList removeDuplicate() {
        if (head == null) {
            return null; // Handle empty list case
        }

        Node current = head;
        int duplicate = current.item;
        LinkedList ll = new LinkedList();
        ll.append(duplicate);

        while (current.next != null) {
            if (duplicate != current.next.item) {
                duplicate = current.next.item;
                ll.append(duplicate);
            }
            current = current.next;
        }

        return ll;
    }

    //Move last element to front of a given Linked List
    public LinkedList moveLast() {
        LinkedList list = new LinkedList();

        // If the list is empty or has only one element, no need to make any changes
        if (head == null || head.next == null) {
            return this;
        }

        Node current = head;
        Node lastElement = head;
        Node secondToLast = null;

        // Find the last element and the second-to-last element
        while (current.next != null) {
            if (current.next.next == null) {
                secondToLast = current;
                lastElement = current.next;
            }
            current = current.next;
        }

        // Remove last element from the original list
        secondToLast.next = null;

        // Add the last element to the front of the new list
        lastElement.next = list.head;
        list.head = lastElement;

        return list;
    }
    public LinkedList middleHead() {
        LinkedList linkedList = new LinkedList();
        Node current = head;
        int size = 0;
        int count = 0;
        int mid = 0;

        // Calculate the size of the linked list and find the middle
        while (current != null) {
            size++;
            current = current.next;
        }

        // Reset current to the beginning of the list
        current = head;

        mid = size / 2;

        // Find the middle node
        while (current != null) {
            if (count == mid - 1) {
                Node midNode = current.next;
                current.next = null; // Disconnect the middle node
                midNode.next = head; // Set the middle node as the new head
                head = midNode; // Update the head
                break;
            }
            current = current.next;
            count++;
        }

        return linkedList;
    }

//    Add 1 to a number represented as linked list
//public int add1() {
//    StringBuilder summation = new StringBuilder();
//    Node current = head;
//
//    // Concatenate the elements of the linked list
//    while (current != null) {
//        summation.append(current.item);
//        current = current.next;
//    }
//    int result = Integer.parseInt(summation.toString()) + 1;
//    String StrResult=result+"";
//    StrResult.indexOf()
//    return result;
//}

}

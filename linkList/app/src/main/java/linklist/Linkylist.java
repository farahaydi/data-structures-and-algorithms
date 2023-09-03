package linklist;

public class Linkylist {
    public Node head;
    public Linkylist()
    {
        this.head=null;
    }
    public void insert (int value)
    {
        try {
            Node nodeValue = new Node(value);
            nodeValue.nextValue = head;
            head = nodeValue;
        }catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
    }
    public boolean includes (int value)
    {
        Node i =head;
        while (i!=null)
        {
            if(i.value == value)
            {return true;}
            i=i.nextValue;
                    }
        return false;
    }
    public String to_string() {
        try {
            String output = "";
            Node heady = head;
            while (heady != null) {
                output += "{" + heady.value + "} -> ";
                heady = heady.nextValue;
            }
            output += "NULL";
            return output;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return null;
        }
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

    public int kthFromEnd(int k) {
        if (head == null || k < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.nextValue;
        }

        if (k >= size) {
            throw new NullPointerException("k is equal to or larger than the list size");
        }
        Node first = head;
        Node second = head;

        for (int i = 0; i < k; i++) {
            if (second == null) {
                throw new IllegalArgumentException("k is larger than the list size");
            }
            second = second.nextValue;
        }

        while (second.nextValue != null) {
            first = first.nextValue;
            second = second.nextValue;
        }

        return first.value;
    }

    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result += "{ " + current.value + " } -> ";
            current = current.nextValue;
        }
        result += "NULL";
        return result;
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

    public static String printToString(Node current) {
        if (current == null) {
            return "null";
        }
        return current.value + " -> " + printToString(current.nextValue);
    }

    public boolean isPalindrome() {
        if (head == null || head.nextValue == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.nextValue != null) {
            slow = slow.nextValue;
            fast = fast.nextValue.nextValue;
        }
        Node secondHalf = reverseLinkedList(slow);
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.value != secondHalf.value) {
                return false;
            }
            firstHalf = firstHalf.nextValue;
            secondHalf = secondHalf.nextValue;
        }

        return true;
    }

    private Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.nextValue;
            current.nextValue = prev;
            prev = current;
            current = next;
        }
        return prev;
    }



    }




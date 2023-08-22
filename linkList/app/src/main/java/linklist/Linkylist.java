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
        int length = 0;
        Node currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.nextValue;
        }
        int positionFromStart = length - k;
        if (positionFromStart < 0) {
            return -1;
        }
        currentNode = head;
        for (int i = 0; i < positionFromStart; i++) {
            currentNode = currentNode.nextValue;
        }

        return currentNode.value;
    }

}




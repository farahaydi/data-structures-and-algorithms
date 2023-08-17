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

}

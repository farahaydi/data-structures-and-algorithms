package linklist;

public class App {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        System.out.println(ll.toString());
        System.out.println("--------------------------------------------------");
        ll.append(1);
        System.out.println(ll.toString());
        ll.append(1);
        System.out.println(ll.toString());

        System.out.println("------------------------***********--------------------------");
        ll.insertAfter(3,11);
        System.out.println(ll.toString());
        System.out.println(ll.size);
        System.out.println("------------------------***********--------------------------");
        System.out.println(ll.indexAt(3));
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        list1.append(1); list1.append(2); list1.append(3);
        list2.append(4); list2.append(5); list2.append(6);
//        LinkedList zippedList = list1.zipLists(list1, list2);

        // Print out the zipped list
//        System.out.println(zippedList.toString());
        System.out.println("------------------------***********--------------------------");
        System.out.println(ll.toString());
        System.out.println(ll.findMid());
        System.out.println(ll.numberOccurs(1));

        LinkedList linkedList = new LinkedList();

        // Populate the linked list with some data
        linkedList.append(1);
        linkedList.append(9);
        linkedList.append(9);
        linkedList.append(9);

        System.out.println(linkedList.add1());





    }
}

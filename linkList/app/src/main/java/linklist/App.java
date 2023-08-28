package linklist;
import static linklist.Linkylist.printToString;

public class App {
    public static void main(String[] args) {

        Linkylist myList = new Linkylist();
        myList.insert(5);
        myList.insert(15);
        myList.insert(25);
        myList.insert(35);
        myList.insert(45);
        myList.insert(55);
        myList.append(60);
        myList.insertBefore(2, 44);
        myList.insertAfter(2, 44);
        myList.append(55);

        System.out.println(myList.to_string());
        System.out.println(myList.includes(2));
        //----------------------------------------------------------------------
        Linkylist test=new Linkylist();
        test.insert(2);
        test.insert(8);
        test.insert(3);
        test.insert(1);
        System.out.println("test = "+ test.to_string());

        try {
            System.out.println("Value =  " + test.kthFromEnd(6));
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
        }catch (NullPointerException e) {
            System.out.println( e.getMessage());
        }

        //-----------------------------------------------------------------------
        System.out.println("//*********************************************************//");
        Linkylist test1 = new Linkylist();
        test1.insert(2);
        test1.insert(3);
        test1.insert(1);

        Linkylist test2 = new Linkylist();
        test2.insert(4);
        test2.insert(9);
        test2.insert(5);

        Node zippedList = test1.zipLists(test1, test2);
        printToString(zippedList);

        Linkylist l1=new Linkylist();
        Linkylist l2=new Linkylist();
        l1.insert(3);
        l1.insert(1);
        l2.insert(4);
        l2.insert(9);
        l2.insert(5);
        Node zl =l1.zipLists(l1,l2);
        printToString(zl);



    }
}

package linklist;

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
    }
}

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


        int kthValue = myList.kthFromEnd(1);
        if (kthValue != -1) {
            System.out.println(kthValue);
        } else {
            System.out.println("Invalid k value or linked list is too short.");
        }
    }
}

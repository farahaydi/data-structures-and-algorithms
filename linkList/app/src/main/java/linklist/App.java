/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linklist;

public class App {
    public static void main(String[] args) {
        Linkylist myList = new Linkylist();
        myList.insert(4);
        myList.insert(3);
        myList.insert(2);
        myList.insert(1);
        System.out.println(myList.to_string());
        System.out.println(myList.includes(2));    }
}
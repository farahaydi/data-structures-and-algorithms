
package stackqueue;

public class App {
    public static void main(String[] args) {
        LinckedStack Ls =new LinckedStack();
        Ls.push(3);
        Ls.push(3);
        Ls.push(8);
        Ls.push(8);


        System.out.println(Ls.pop());
        System.out.println(Ls.peek());

    }
}

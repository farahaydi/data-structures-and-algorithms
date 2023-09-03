
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

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        LinkedQueue lq =new LinkedQueue();
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        System.out.println(lq.length);
        System.out.println(lq.dequeue());
        System.out.println(lq.length);
        System.out.println(lq.dequeue());
        System.out.println(lq.length);
        System.out.println(lq.peek());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        System.out.println(pseudoQueue.length);
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());



    }
}

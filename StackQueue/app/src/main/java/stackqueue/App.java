
package stackqueue;

import static stackqueue.BracketValidator.validateBrackets;

public class App {
    public static void main(String[] args) {
        LinckedStack Ls =new LinckedStack();
        Ls.push(3);
        Ls.push(3);
        Ls.push(8);
        Ls.push(8);
        Ls.push(10);

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

        System.out.println("psedoooo");
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(20);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(5);
//        pseudoQueue.enqueue(5);
//        pseudoQueue.enqueue(6);

//        System.out.println(pseudoQueue.length);
//        System.out.println(pseudoQueue.dequeue());
//        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.toString());

//Queue


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Animal("dog", "Buddy"));
        shelter.enqueue(new Animal("cat", "Whiskers"));
        shelter.enqueue(new Animal("dog", "Rex"));
        shelter.enqueue(new Animal("cat", "Mittens"));
        Animal adoptedDog = shelter.dequeue("dog");
        if (adoptedDog != null) {
            System.out.println("Adopted Dog: " + adoptedDog.getName());
        } else {
            System.out.println("No dogs available for adoption.");
        }

        Animal adoptedCat = shelter.dequeue("cat");
        if (adoptedCat != null) {
            System.out.println("Adopted Cat: " + adoptedCat.getName());
        } else {
            System.out.println("No cats available for adoption.");
        }
        Animal invalidAnimal = shelter.dequeue("rabbit");
        if (invalidAnimal != null) {
            System.out.println("Adopted Animal: " + invalidAnimal.getName());
        } else {
            System.out.println("Invalid preference. No animal adopted.");
        }


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println(validateBrackets("{}"));
        System.out.println(validateBrackets("{}(){}"));
        System.out.println(validateBrackets("()[[Extra Characters]]"));
        System.out.println(validateBrackets("(){}[[]]"));
        System.out.println(validateBrackets("{}{Code}[Fellows](())"));
        System.out.println(validateBrackets("[({}]"));
        System.out.println(validateBrackets("(]("));
        System.out.println(validateBrackets("{(})"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        LinckedStack stack = new LinckedStack();
        stack.push(5);
        stack.push(8);
        stack.push(3);
        stack.push(12);
        stack.push(7);

        int max = stack.getMax();

        System.out.println("The maximum value in the stack is: " + max);

    }
}

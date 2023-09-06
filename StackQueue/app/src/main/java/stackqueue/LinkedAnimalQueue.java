package stackqueue;

public class LinkedAnimalQueue {
    private AnimalNode head;
    private AnimalNode tail;
    private int length;

    public LinkedAnimalQueue() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(Animal animal) {
        AnimalNode newNode = new AnimalNode(animal);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    public Animal dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        Animal animal = head.getAnimal();
        head = head.getNext();
        length--;
        return animal;
    }

    public Animal peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return head.getAnimal();
    }

    public int size() {
        return length;
    }
}

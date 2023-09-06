package stackqueue;

public class AnimalNode {
    private Animal animal;
    private AnimalNode next;

    public AnimalNode(Animal animal) {
        this.animal = animal;
        this.next = null;
    }

    public Animal getAnimal() {
        return animal;
    }

    public AnimalNode getNext() {
        return next;
    }

    public void setNext(AnimalNode next) {
        this.next = next;
    }
}

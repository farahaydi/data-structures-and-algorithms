package stackqueue;

public class AnimalShelter {
    private LinkedAnimalQueue dogs;
    private LinkedAnimalQueue cats;

    public AnimalShelter() {
        dogs = new LinkedAnimalQueue();
        cats = new LinkedAnimalQueue();
    }

    public void enqueue(Animal animal) {
        if (animal == null || (!animal.getSpecies().equals("dog") && !animal.getSpecies().equals("cat"))) {
            return;
        }

        if (animal.getSpecies().equals("dog")) {
            dogs.enqueue(animal);
        } else {
            cats.enqueue(animal);
        }
    }

    public Animal dequeue(String pref) {
        if (pref == null || (!pref.equals("dog") && !pref.equals("cat"))) {
            return null;
        }

        if (pref.equals("dog") && !dogs.isEmpty()) {
            return dogs.dequeue();
        } else if (pref.equals("cat") && !cats.isEmpty()) {
            return cats.dequeue();
        } else {
            return null;
        }
    }
    }

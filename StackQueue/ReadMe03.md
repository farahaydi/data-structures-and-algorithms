# Code Challenge: Class 12
The challenge involves creating an "AnimalShelter" class that functions as a shelter for dogs and cats, operating on a first-in, first-out (FIFO) basis. This class should have methods for adding animals (enqueue) and adopting animals (dequeue) based on user preferences. The "enqueue" method adds animals to the shelter, while the "dequeue" method retrieves animals according to a specified preference ("dog" or "cat") and preserves the order of arrival. Handling of invalid inputs, such as an invalid preference or improperly formatted animal data, is an essential aspect of the challenge. The goal is to efficiently manage the shelter's operations while ensuring proper handling of animals and preferences.

## Whiteboard Process
[class12](./Screenshot%20(461).png)

## Approach & Efficiency

Approach

Data Structure: To implement the "AnimalShelter" class, we use two separate queues, one for dogs and one for cats. This choice ensures that animals are maintained in the order of their arrival in each category.

enqueue Method:

We validate the input Animal object to ensure it has a valid species ("dog" or "cat") and a name (a non-empty string).
Based on the species, we enqueue the animal into the corresponding queue (dogs or cats).
dequeue Method:

We validate the user's preference to ensure it's either "dog" or "cat."
If the preference is "dog" and the dog queue is not empty, we dequeue and return the first dog in the queue, preserving the order of arrival.
If the preference is "cat" and the cat queue is not empty, we dequeue and return the first cat in the queue, preserving the order of arrival.
If there are no animals of the preferred type available, we return null.
Efficiency

Enqueue:

Time Complexity: O(1) - Enqueuing an animal is a constant-time operation because it involves adding an animal to the end of a queue, which takes the same amount of time regardless of the number of animals.
Space Complexity: O(1) - The space used by the queues is proportional to the number of animals, but it does not depend on the number of animals enqueued individually.
Dequeue:

Time Complexity: O(1) on average - Dequeuing an animal is a constant-time operation because we are always dequeuing the first animal in the queue.
Space Complexity: O(1) - The space used for returning an animal is constant, as it does not depend on the number of animals.


## Solution

## Example

Here's an example of how to use the `AnimalShelter` class in a Java program:

```java
public class Main {
 public static void main(String[] args) {
     AnimalShelter shelter = new AnimalShelter();

     // Enqueue some animals
     shelter.enqueue(new Animal("dog", "Buddy"));
     shelter.enqueue(new Animal("cat", "Whiskers"));
     shelter.enqueue(new Animal("dog", "Rex"));
     shelter.enqueue(new Animal("cat", "Mittens"));

     // Dequeue a preferred animal
     Animal adoptedDog = shelter.dequeue("dog");
     if (adoptedDog != null) {
         System.out.println("Adopted Dog: " + adoptedDog.getName());
     } else {
         System.out.println("No dogs available for adoption.");
     }

     // Dequeue a preferred animal
     Animal adoptedCat = shelter.dequeue("cat");
     if (adoptedCat != null) {
         System.out.println("Adopted Cat: " + adoptedCat.getName());
     } else {
         System.out.println("No cats available for adoption.");
     }

     // Try to dequeue an invalid preference
     Animal invalidAnimal = shelter.dequeue("rabbit");
     if (invalidAnimal != null) {
         System.out.println("Adopted Animal: " + invalidAnimal.getName());
     } else {
         System.out.println("Invalid preference. No animal adopted.");
     }
 }
}  
```

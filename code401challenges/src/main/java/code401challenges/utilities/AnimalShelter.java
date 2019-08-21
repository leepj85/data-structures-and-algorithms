package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

public class AnimalShelter {

    public Queue<Animal> shelterQueue;
    public AnimalShelter() {
        shelterQueue = new Queue<>();
    }
    public void enqueue(Animal animal) {
        shelterQueue.enqueue(animal);
    }

    public Animal dequeue(String animal) {
        if (animal.equals("Dog") || animal.equals("Cat")) {
            return shelterQueue.dequeue();
        } else {
            return null;
        }
    }
}

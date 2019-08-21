package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter shelter = new AnimalShelter();

    @Test
    public void enqueueAndDequeueTest() {
        shelter.enqueue(new Dog());
        shelter.enqueue(new Cat());
//        System.out.println(shelter.shelterQueue);
        String results = shelter.shelterQueue.toString();
        assertTrue(results.equals("Front --> Dog --> Cat --> Back"));

        Animal mystery = shelter.dequeue("Cat");
        assertTrue(mystery.toString().equals("Dog"));

        Animal n = shelter.dequeue("null");
        assertTrue(n == null);
    }
}
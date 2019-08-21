package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testDog() {
        Animal dog = new Dog();
        System.out.println(dog);
        System.out.println("This is the class of dog: " + dog.getClass());
    }
}
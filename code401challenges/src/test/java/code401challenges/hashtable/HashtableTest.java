package code401challenges.hashtable;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void add() {
        Hashtable hashtable = new Hashtable();
        assertEquals(hashtable.add("Human", "Peter"), "Peter");
    }

    @Test
    public void getIndex() {
        Hashtable hashtable = new Hashtable();
        assertEquals(hashtable.getIndex("Human"), 415);
    }

    @Test
    public void get() {
        Hashtable hashtable = new Hashtable();
        hashtable.add("Human", "Peter");
        System.out.println(hashtable.get("Human"));
    }

    @Test
    public void contains() {
        Hashtable hashtable = new Hashtable();
        hashtable.add("Human", "Peter");
        assertTrue(hashtable.contains("Human"));
    }

}
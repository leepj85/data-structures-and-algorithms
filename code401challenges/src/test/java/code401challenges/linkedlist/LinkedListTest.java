package code401challenges.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void LinkedList(){
        LinkedList<String> linkedList= new LinkedList<>();

        linkedList.insert("hi");
        assertEquals("check if 'insert' and 'toString' methods work", "hi ", linkedList.toString() );

        linkedList.insert("world");
        assertEquals("check if 'insert' method adds to the beginning of LinkedList",
                "world hi ", linkedList.toString());

        assertTrue("check if 'includes' method returns true when value exists in LinkedList", linkedList.includes("world"));
        assertFalse("check if 'includes' method returns false when value does not exist in LinkedList", linkedList.includes("blob"));
    }
}
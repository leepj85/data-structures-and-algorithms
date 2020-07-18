package code401challenges.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void linkedList(){
        LinkedList<String> linkedList= new LinkedList<>();

        linkedList.insert("hi");
        assertEquals("check if 'insert' and 'toString' methods work", "head --> hi --> end", linkedList.toString() );

        linkedList.insert("world");
        assertEquals("check if 'insert' method adds to the beginning of LinkedList",
                "head --> world --> hi --> end", linkedList.toString());

        assertTrue("check if 'includes' method returns true when value exists in LinkedList", linkedList.includes("world"));
        assertFalse("check if 'includes' method returns false when value does not exist in LinkedList", linkedList.includes("blob"));
    }

    @Test
    public void linkedListInsertion() {

        LinkedList<Integer> testSingleNode = new LinkedList<>();
        testSingleNode.append(1);
        assertEquals ("check if 'append' method adds node to an empty LinkedList",
                "head --> 1 --> end", testSingleNode.toString());

        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.append(3);
        ll.append(2);
        ll.append(5);
        assertEquals("check if 'append' method adds to the end of a LinkedList",
                "head --> 1 --> 3 --> 2 --> 5 --> end", ll.toString());

        LinkedList<Integer> llInsertBefore1 = new LinkedList<>();
        llInsertBefore1.append(1);
        llInsertBefore1.append(3);
        llInsertBefore1.append(2);
        llInsertBefore1.insertBefore(3, 5);
        assertEquals("add 5 before 3 using 'insertBefore()'",
                "head --> 1 --> 5 --> 3 --> 2 --> end", llInsertBefore1.toString());

        LinkedList<Integer> llInsertBefore2 = new LinkedList<>();
        llInsertBefore2.append(1);
        llInsertBefore2.append(3);
        llInsertBefore2.append(2);
//        System.out.println(llInsertBefore2.toString());
        llInsertBefore2.insertBefore(1,5);
        assertEquals("add 5 before 1 using 'insertBefore()'",
                "head --> 5 --> 1 --> 3 --> 2 --> end", llInsertBefore2.toString());

        LinkedList<Integer> llInsertBefore3 = new LinkedList<>();
        llInsertBefore3.append(1);
        llInsertBefore3.append(2);
        llInsertBefore3.append(2);
        llInsertBefore3.insertBefore(2, 5);
        assertEquals("add 5 before 2 using 'insertBefore()'",
                "head --> 1 --> 5 --> 2 --> 2 --> end", llInsertBefore3.toString());

//        LinkedList<Integer> llInsertBefore4 = new LinkedList<>();
//        llInsertBefore4.append(1);
//        llInsertBefore4.append(3);
//        llInsertBefore4.append(2);
//        System.out.println(llInsertBefore4.toString());
//        llInsertBefore4.insertBefore(4, 5);
//        System.out.println(llInsertBefore4.toString());


        LinkedList<Integer> insertAfterTest1 = new LinkedList<>();
        insertAfterTest1.append(1);
        insertAfterTest1.append(3);
        insertAfterTest1.append(2);
        insertAfterTest1.insertAfter(3, 5);
        assertEquals("add 5 after 3 using 'insertAfter()'",
                "head --> 1 --> 3 --> 5 --> 2 --> end", insertAfterTest1.toString());


        LinkedList<Integer> insertAfterTest2 = new LinkedList<>();
        insertAfterTest2.append(1);
        insertAfterTest2.append(3);
        insertAfterTest2.append(2);
        insertAfterTest2.insertAfter(2, 5);
        assertEquals("add 5 after 2 using 'insertAfter()'",
                "head --> 1 --> 3 --> 2 --> 5 --> end", insertAfterTest2.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testKthFromTheEnd() {
        LinkedList<Integer> kthTest = new LinkedList<>();
        kthTest.append(2);
        kthTest.append(4);
        kthTest.append(6);
        int result = kthTest.kthFromEnd(3);
        assertEquals("result should equal '2'", 2, result);
        int result1 = kthTest.kthFromEnd((0));
        assertEquals("should grab last node value (6)", 6, result1);
        int badresult = kthTest.kthFromEnd(6);
//        System.out.println(badresult);
        assertEquals("should return null", null, badresult);
        int happyPath = kthTest.kthFromEnd(1);
        assertEquals("should return 4", 4, happyPath);

        LinkedList<Integer> oneNodeLL = new LinkedList<>();
        oneNodeLL.append(5);
        int x = oneNodeLL.kthFromEnd(0);
        assertEquals("should return value '5' from single node in LL", 5, x);


    }

    @Test
    public void testMerge() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.append(1);
        list1.append(3);
        list1.append(2);
        list2.append(5);
        list2.append(9);
        list2.append(4);

        LinkedList<Integer> results = LinkedList.mergeLists(list1, list2);
        assertEquals("head --> 1 --> 5 --> 3 --> 9 --> 2 --> 4 --> end", results.toString());


    }


}
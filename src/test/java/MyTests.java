import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testInsertFirst() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertFirst(i);
        }
        assertEquals("6 -> 1 -> 3 -> null", list.toString());
    }

    @Test
    public void testInsertLast() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertLast(i);
        }
        assertEquals("3 -> 1 -> 6 -> null", list.toString());
    }

    @Test
    public void testSearch() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertLast(i);
        }
        assertTrue(list.search(3));
        assertTrue(list.search(1));
        assertTrue(list.search(6));
        assertFalse(list.search(5));
    }

    @Test
    public void testRemoveFirst() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertLast(i);
        }
        assertEquals(3, list.removeFirst());
        assertEquals(1, list.removeFirst());
        assertEquals(6, list.removeFirst());
    }

    @Test
    public void testRemoveLast() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertLast(i);
        }
        assertEquals(6, list.removeLast());
        assertEquals(1, list.removeLast());
        assertEquals(3, list.removeLast());
    }

    @Test
    public void testRemoveAll() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6, 1, 3, 5};
        for(int i : arr){
            list.insertLast(i);
        }
        list.removeAll(1);
        assertFalse(list.search(1));
        list.removeAll(3);
        assertFalse(list.search(3));
    }

    @Test
    public void testReverse() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertLast(i);
        }
        assertEquals(list.toString(), "3 -> 1 -> 6 -> null");

        list.reverse();

        assertEquals(list.toString(), "6 -> 1 -> 3 -> null");
    }

    @Test
    public void testHasCycle() {

        IntLinkedList list = new IntLinkedList();
        int[] arr = new int[]{3, 1, 6};
        for(int i : arr){
            list.insertLast(i);
        }

        assertFalse(list.hasCycle());

        list.makeCyclical();

        assertTrue(list.hasCycle());
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testInsertFirst() {

        IntLinkedList l1 = new IntLinkedList();
        int[] li = new int[]{3, 1, 6};
        for(int i: li){
            l1.insertFirst(i);
        }
        assertTrue(l1.search(3) && l1.search(1) && l1.search(6));
    }

    @Test
    public void testInsertLast() {

        IntLinkedList l1 = new IntLinkedList();
        int[] li = new int[]{3, 1, 6};
        for(int i: li){
            l1.insertLast(i);
        }
        assertTrue(l1.search(3) && l1.search(1) && l1.search(6));
    }

    @Test
    public void testSearch() {

        IntLinkedList l1 = new IntLinkedList();
        int[] li = new int[]{3, 1, 6};
        for(int i: li){
            l1.insertLast(i);
        }
        assertTrue(l1.search(3) && l1.search(1) && l1.search(6) && !l1.search(5));
    }

    @Test
    public void testRemoveFirst() {

        IntLinkedList l1 = new IntLinkedList();
        int[] li = new int[]{3, 1, 6};
        for(int i: li){
            l1.insertLast(i);
        }
        assertTrue(l1.removeFirst()==3 && l1.removeFirst()==1 && l1.removeFirst()==6);
    }

    @Test
    public void testRemoveLast() {

        IntLinkedList l1 = new IntLinkedList();
        int[] li = new int[]{3, 1, 6};
        for(int i: li){
            l1.insertLast(i);
        }
        assertTrue(l1.removeFirst()==6 && l1.removeFirst()==1 && l1.removeFirst()==3);
    }

    @Test
    public void testRemoveAll() {

        IntLinkedList l1 = new IntLinkedList();
        int[] li = new int[]{3, 1, 6, 1, 3, 5};
        for(int i: li){
            l1.insertLast(i);
        }
        l1.removeAll(1);
        assertFalse(l1.search(1));
        l1.removeAll(3);
        assertFalse(l1.search(3));
    }
}
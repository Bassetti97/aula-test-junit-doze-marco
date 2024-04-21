package org.example.OrderingTest;

import org.example.Ordering.BubbleSort;
import org.example.Ordering.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testBubbleSortDescending() {
        int[] array = {64, 25, 12, 22, 11, 89};
        int[] expected = {89, 64, 25, 22, 12, 11};

        BubbleSort.bubbleSortDescending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testBubbleSortAscending() {
        int[] array = {64, 25, 12, 22, 11, 89};
        int[] expected = {11, 12, 22, 25, 64, 89};

        BubbleSort.bubbleSortAscending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testBubbleSortAscendingEmptyArray() {
        int[] array = {};
        int[] expected = {};

        BubbleSort.bubbleSortAscending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testBubbleSortDescendingEmptyArray() {
        int[] array = {};
        int[] expected = {};

        BubbleSort.bubbleSortDescending(array, array.length);

        assertArrayEquals(expected, array);
    }
}

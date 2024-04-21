package org.example.OrderingTest;

import org.example.Ordering.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    public void testInsertionSortDescending() {
        int[] array = {64, 25, 12, 22, 11, 89};
        int[] expected = {89, 64, 25, 22, 12, 11};

        InsertionSort.insertionSortDescending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testInsertionSortAscending() {
        int[] array = {64, 25, 12, 22, 11, 89};
        int[] expected = {11, 12, 22, 25, 64, 89};

        InsertionSort.insertionSortAscending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testInsertionSortAscendingEmptyArray() {
        int[] input = {};
        int[] expected = {};

        InsertionSort.insertionSortAscending(input, input.length);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSortDescendingEmptyArray() {
        int[] input = {};
        int[] expected = {};

        InsertionSort.insertionSortDescending(input, input.length);

        assertArrayEquals(expected, input);
    }
}

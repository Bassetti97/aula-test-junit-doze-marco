package org.example.OrderingTest;

import org.example.Ordering.BubbleSort;
import org.example.Ordering.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void testSelectionSortDescending() {
        int[] array = {64, 25, 12, 89, 11, 22};
        int[] expected = {89, 64, 25, 22, 12, 11};

        SelectionSort.selectionSortDescending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSelectionSortAscending() {
        int[] array = {64, 25, 12, 89, 11, 22};
        int[] expected = {11, 12, 22, 25, 64, 89};

        SelectionSort.selectionSortAscending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSelectionSortAscendingEmptyArray() {
        int[] array = {};
        int[] expected = {};

        SelectionSort.selectionSortAscending(array, array.length);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSelectionSortDescendingEmptyArray() {
        int[] array = {};
        int[] expected = {};

        SelectionSort.selectionSortDescending(array, array.length);

        assertArrayEquals(expected, array);
    }
}
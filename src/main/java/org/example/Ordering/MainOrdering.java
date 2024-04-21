package org.example.Ordering;

import static org.example.Ordering.BubbleSort.bubbleSortAscending;
import static org.example.Ordering.BubbleSort.bubbleSortDescending;
import static org.example.Ordering.InsertionSort.insertionSortAscending;
import static org.example.Ordering.InsertionSort.insertionSortDescending;
import static org.example.Ordering.SelectionSort.selectionSortAscending;
import static org.example.Ordering.SelectionSort.selectionSortDescending;

public class MainOrdering {
    public static void main(String[] args) {

        int[] array1 = {64, 25, 12, 22, 11, 25};
        int[] array2 = {66, 20, 67, 22, 9, 897};
        int[] array3 = {689, 276, 67, 34, 11, 751};

        System.out.println("=====================================================================");
        System.out.println("Array Insertion Sort (ASCENDING):");
        insertionSortAscending(array1, array1.length);
        printArray(array1);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Array Insertion Sort (DESCENDING):");
        insertionSortDescending(array1, array1.length);
        printArray(array1);

        System.out.println("=====================================================================");

        System.out.println("Array Selection Sort (ASCENDING):");
        selectionSortAscending(array2, array2.length);
        printArray(array2);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Array Selection Sort (DESCENDING):");
        selectionSortDescending(array2, array2.length);
        printArray(array2);

        System.out.println("=====================================================================");

        System.out.println("Array Bubble Sort (ASCENDING):");
        bubbleSortAscending(array3, array3.length);
        printArray(array3);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Array Bubble Sort (DESCENDING):");
        bubbleSortDescending(array3, array3.length);
        printArray(array3);

        System.out.println("=====================================================================");
    }

    static void printArray(int[] array) {
        int numbers = array.length;
        for (int i = 0; i < numbers; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}



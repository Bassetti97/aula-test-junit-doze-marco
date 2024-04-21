package org.example.Ordering;

public class SelectionSort {

    public static void selectionSortAscending(int[] array, int number) {
        for (int i = 0; i < number - 1; i++) {
            int valueMin = i;
            for (int j = i + 1; j < number; j++) {
                if (array[j] < array[valueMin]) {
                    valueMin = j;
                }
            }
            int temporary = array[valueMin];
            array[valueMin] = array[i];
            array[i] = temporary;
        }
    }

    public static void selectionSortDescending(int[] array, int number) {
        for (int i = 0; i < number - 1; i++) {
            int valueMax = i;
            for (int j = i + 1; j < number; j++) {
                if (array[j] > array[valueMax]) {
                    valueMax = j;
                }
            }
            int temporary = array[valueMax];
            array[valueMax] = array[i];
            array[i] = temporary;
        }
    }
}


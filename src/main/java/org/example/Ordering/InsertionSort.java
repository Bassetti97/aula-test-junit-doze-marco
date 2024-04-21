package org.example.Ordering;

public class InsertionSort {
    public static void insertionSortAscending(int[] array, int number) {
        for (int i = 1; i < number; i++) {
            int valueCurrent = array[i];
            int valueBeforeI = i - 1;

            while (valueBeforeI >= 0 && array[valueBeforeI] > valueCurrent) {
                array[valueBeforeI + 1] = array[valueBeforeI];
                valueBeforeI--;
            }
            array[valueBeforeI + 1] = valueCurrent;
        }
    }

    public static void insertionSortDescending(int[] array, int number) {
        for (int i = 1; i < number; i++) {
            int valueCurrent = array[i];
            int valueBeforeI = i - 1;

            while (valueBeforeI >= 0 && array[valueBeforeI] < valueCurrent) {
                array[valueBeforeI + 1] = array[valueBeforeI];
                valueBeforeI--;
            }
            array[valueBeforeI + 1] = valueCurrent;
        }
    }
}


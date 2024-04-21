package org.example.Ordering;

public class BubbleSort {
    public static void bubbleSortAscending(int[] array, int number) {
        for (int i = 0; i < number - 1; i++) {
            for (int currentPosition = 0; currentPosition < number - i - 1; currentPosition++) {
                if (array[currentPosition] > array[currentPosition + 1]) {
                    int temporary = array[currentPosition];
                    array[currentPosition] = array[currentPosition + 1];
                    array[currentPosition + 1] = temporary;
                }
            }
        }
    }
    public static void bubbleSortDescending(int[] array, int number) {
        for (int i = 0; i < number - 1; i++) {
            for (int currentPosition = 0; currentPosition < number - i - 1; currentPosition++) {
                if (array[currentPosition] < array[currentPosition + 1]) {
                    int temporary = array[currentPosition];
                    array[currentPosition] = array[currentPosition + 1];
                    array[currentPosition + 1] = temporary;
                }
            }
        }
    }
}


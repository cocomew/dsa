package dsa.sort;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];  // Save the element to insert
            int j = i - 1;         // Start from previous element

            // Shift all elements greater than 'current' to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];  // Move element one position right
                j--;
            }

            // Insert 'current' at its correct position
            arr[j + 1] = current;
        }
    }
}
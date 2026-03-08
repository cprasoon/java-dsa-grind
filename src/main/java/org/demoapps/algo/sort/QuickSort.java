package org.demoapps.algo.sort;

public class QuickSort {

    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivot = arr[high];
            int pIndex = low - 1;
            for (int i = low; i <= high - 1; i++) {
                if (arr[i] <= pivot) {
                    pIndex++;
                    swap(arr, i, pIndex);
                }
            }
            pIndex++;
            swap(arr, pIndex, high);

            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

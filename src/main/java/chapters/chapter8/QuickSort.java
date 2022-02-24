package chapters.chapter8;

import static utils.Utils.arrayUtils;

public class QuickSort {
    public void sort(Integer[] array) {
        sort(array, 0, array.length - 1);
        arrayUtils().print(array);
    }

    private void sort(Integer[] array, int start, int end) {
        if (start >= end)
            return;

        int pivot = partition(array, start, end);
        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);
    }

    private int partition(Integer[] array, int start, int end) {
        int pivot = array[end];
        int i = start;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] <= pivot) {
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, end);

        return i;
    }

    private void swap(Integer[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

package chapters.chapter3;

import static utils.Utils.arrayUtils;

/**
 * Insertion sort is relatively good for small lists and can be used along
 * with other sorting algorithms (e.g. shell sort). It's quite good with partially sorted lists,
 * because that reduces the amount of steps it would take to sort them.
 */
public class InsertionSort {
    public void sort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentValue;
        }

        arrayUtils().print(array);
    }
}

package chapters.chapter3;

import static utils.Utils.arrayUtils;

/**
 * Selection sort is better than bubble sort, it's running time is independent of ordering of elements,
 * because it requires the same number of steps to perform.
 */
public class SelectionSort {
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minValueIndex] > array[j])
                    minValueIndex = j;
            }

            int temp = array[minValueIndex];
            array[minValueIndex] = array[i];
            array[i] = temp;
        }

        arrayUtils().print(array);
    }
}

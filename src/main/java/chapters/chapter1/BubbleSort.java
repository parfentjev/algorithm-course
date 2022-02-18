package chapters.chapter1;

import static utils.Utils.arrayUtils;

/**
 * Bubble sort is very inefficient, so never use it in a real program.
 */
public class BubbleSort {
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        arrayUtils().print(array);
    }
}

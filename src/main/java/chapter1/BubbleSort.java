package chapter1;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] array) {
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

        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}

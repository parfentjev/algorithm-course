package chapter1;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - 1; j++) {
                int val1 = array[j];
                int val2 = array[j + 1];

                if (val1 > val2) {
                    array[j] = val2;
                    array[j + 1] = val1;

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

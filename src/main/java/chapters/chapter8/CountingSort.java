package chapters.chapter8;

import static utils.Utils.arrayUtils;

public class CountingSort {
    public void sort(Integer[] array) {
        int[] tempArray = new int[11];

        for (Integer i : array) {
            tempArray[i]++;
        }

        int arrayIndex = 0;
        for (int tempArrayIndex = 0; tempArrayIndex < tempArray.length; tempArrayIndex++) {
            for (int counter = 0; counter < tempArray[tempArrayIndex]; counter++) {
                array[arrayIndex] = tempArrayIndex;
                arrayIndex++;
            }
        }

        arrayUtils().print(array);
    }
}

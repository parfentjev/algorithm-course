package chapters.chapter6;

public class MergeSort {
    public void sort(Integer[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(Integer[] array, int start, int end) {
        if (start >= end)
            return;

        int middlePoint = (int) Math.floor((start + end) >> 1);
        sort(array, start, middlePoint);
        sort(array, middlePoint + 1, end);
        merge(array, start, middlePoint, end);
    }

    private void merge(Integer[] array, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] tempLeft = new int[leftSize];
        int[] tempRight = new int[rightSize];

        for (int l = 0; l < leftSize; l++) {
            tempLeft[l] = array[start + l];
        }

        for (int r = 0; r < rightSize; r++) {
            tempRight[r] = array[mid + 1 + r];
        }

        int l = 0, r = 0;
        for (int i = start; i <= end; i++) {
            if (r >= rightSize || l < leftSize && tempLeft[l] <= tempRight[r]) {
                array[i] = tempLeft[l];
                l++;
            } else {
                array[i] = tempRight[r];
                r++;
            }
        }
    }
}

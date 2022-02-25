package chapters.chapter9;

import static utils.Utils.arrayUtils;

public class Heap {
    private final Integer[] heap;

    public Heap(Integer[] input) {
        heap = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            heap[i] = input[i];

            if (i > 0)
                swapChildAndParent(i);
        }

        arrayUtils().print(heap);
    }

    private void swapChildAndParent(int childIndex) {
        int parentIndex = Math.max((int) Math.floor((childIndex - 1) >> 1), 0);

        if (heap[parentIndex] >= heap[childIndex])
            return;

        int temp = heap[parentIndex];
        heap[parentIndex] = heap[childIndex];
        heap[childIndex] = temp;

        swapChildAndParent(parentIndex);
    }

    public Integer[] getHeap() {
        return heap;
    }
}

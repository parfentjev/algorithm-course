package chapters.chapter3;

public class BinarySearch {
    public int findElement(Integer[] array, int element) {
        int minIndex = 0;
        int maxIndex = array.length - 1;
        int currentIndex;

        while (minIndex < array.length && maxIndex >= 0) {
            currentIndex = Math.floorDiv(maxIndex + minIndex, 2);

            if (array[currentIndex] == element)
                return currentIndex;
            else if (array[currentIndex] > element)
                maxIndex = currentIndex - 1;
            else
                minIndex = currentIndex + 1;
        }

        return -1;
    }
}

package chapter1;

public class EuclidAlgorithm {
    public int findGreatestCommonDivider(int a, int b) {
        int maxVal = Math.max(a, b);
        int minVal = Math.min(a, b);
        int remainder;

        while ((remainder = maxVal % minVal) != 0) {
            maxVal = minVal;
            minVal = remainder;
        }

        return minVal;
    }
}

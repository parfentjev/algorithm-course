package chapters.chapter6;

public class EuclidAlgorithmRecursion {
    public int findGreatestCommonDivider(int a, int b) {
        if (b == 0)
            return a;

        return findGreatestCommonDivider(b, a % b);
    }
}

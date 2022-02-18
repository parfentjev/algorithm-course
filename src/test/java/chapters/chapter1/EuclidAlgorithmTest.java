package chapters.chapter1;

import chapters.chapter1.EuclidAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclidAlgorithmTest {
    @Test
    public void aGreaterThanBAndBIsNotGreatestCommonDivider() {
        float greatestCommonDivider = new EuclidAlgorithm().findGreatestCommonDivider(12, 9);

        assertEquals(3, greatestCommonDivider);
    }

    @Test
    public void aLessThanBAndAIsNotGreatestCommonDivider() {
        float greatestCommonDivider = new EuclidAlgorithm().findGreatestCommonDivider(9, 12);

        assertEquals(3, greatestCommonDivider);
    }

    @Test
    public void aGreaterThanBAndBIsGreatestCommonDivider() {
        float greatestCommonDivider = new EuclidAlgorithm().findGreatestCommonDivider(8, 4);

        assertEquals(4, greatestCommonDivider);
    }

    @Test
    public void aLessThanBAndBIsGreatestCommonDivider() {
        float greatestCommonDivider = new EuclidAlgorithm().findGreatestCommonDivider(4, 8);

        assertEquals(4, greatestCommonDivider);
    }

    @Test
    public void aEqualsToB() {
        float greatestCommonDivider = new EuclidAlgorithm().findGreatestCommonDivider(4, 4);

        assertEquals(4, greatestCommonDivider);
    }
}

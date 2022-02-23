package chapters.chapter6;

import org.junit.jupiter.api.Test;

public class TowerOfHanoiTest {
    @Test
    public void solve3DisksPuzzle() {
        new TowerOfHanoi().move(4, 'A', 'C', 'B');
    }
}

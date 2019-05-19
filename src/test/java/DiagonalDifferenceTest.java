import org.junit.Test;
import static org.junit.Assert.*;

public class DiagonalDifferenceTest {

    @Test
    public void testDiagonalDifference() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        int result = DiagonalDifference.compute(array);
        assertEquals(2, result);
    }
}

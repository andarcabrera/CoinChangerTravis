import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by andacabrera29 on 2/22/16.
 */
public class CoinChangerTest {

    private CoinChanger c;

    @Before
    public void setUp() throws Exception {
        c = new CoinChanger();
    }

    @Test
    public void testCents() {

        ArrayList<Integer> testArray = new ArrayList<Integer>() {{
            add(1);
        }};
        assertEquals(makeTestChange(1), c.makeChange(1));
        assertEquals(makeTestChange(1, 1), c.makeChange(2));
        assertEquals(makeTestChange(1, 1, 1), c.makeChange(3));
        assertEquals(makeTestChange(1, 1, 1, 1), c.makeChange(4));
    }

    @Test
    public void testNickle() {
        assertEquals(makeTestChange(5), c.makeChange(5));
        assertEquals(makeTestChange(5, 1), c.makeChange(6));
        assertEquals(makeTestChange(5, 1, 1), c.makeChange(7));
        assertEquals(makeTestChange(5, 1, 1, 1), c.makeChange(8));
        assertEquals(makeTestChange(5, 1, 1, 1, 1), c.makeChange(9));
    }

    @Test
    public void testDime() {
        assertEquals(makeTestChange(10), c.makeChange(10));
        assertEquals(makeTestChange(10, 1), c.makeChange(11));
        assertEquals(makeTestChange(10, 1, 1), c.makeChange(12));
        assertEquals(makeTestChange(10, 5), c.makeChange(15));
        assertEquals(makeTestChange(10, 10), c.makeChange(20));
        assertEquals(makeTestChange(25), c.makeChange(25));
    }

    @Test
    public void testQuarter() {
        assertEquals(makeTestChange(25), c.makeChange(25));
        assertEquals(makeTestChange(25, 1), c.makeChange(26));
        assertEquals(makeTestChange(25, 1, 1), c.makeChange(27));
        assertEquals(makeTestChange(25, 1, 1, 1), c.makeChange(28));
    }

    @Test
    public void testMixedCurrency() {
        assertEquals(makeTestChange(25, 25, 25, 10, 10, 1, 1, 1, 1), c.makeChange(99));
    }

    public List makeTestChange(int... a) {
        ArrayList<Integer> testChange = new ArrayList<Integer>();
        for (int i=0; i<a.length; i++) {
            testChange.add(a[i]);
        }
        return testChange;
    }
}
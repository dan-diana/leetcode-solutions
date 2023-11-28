package org.example.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.algotithms.TwoSum;
import org.junit.jupiter.api.Test;

class TwoSumDiffblueTest {
    /**
     * Method under test: {@link TwoSum#twoSum(int[], int)}
     */
    @Test
    void testTwoSum() {
        assertEquals(0, TwoSum.twoSum(new int[]{1000, 10, 1000, 10}, 1).length);
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{1000, 10, 1000, 10}, 1010));
    }
}


package org.example.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwoSum1DiffblueTest {
    /**
     * Method under test: {@link TwoSum1#twoSum(int[], int)}
     */
    @Test
    void testTwoSum() {
        assertEquals(0, TwoSum1.twoSum(new int[]{1000, 10, 1000, 10}, 1).length);
        assertArrayEquals(new int[]{0, 1}, TwoSum1.twoSum(new int[]{1000, 10, 1000, 10}, 1010));
    }

    /**
     * Method under test: {@link TwoSum1#twoSumUsingMap(int[], int)}
     */
    @Test
    void testTwoSumUsingMap() {
        assertEquals(0, TwoSum1.twoSumUsingMap(new int[]{1000, 10, 1000, 10}, 1).length);
        assertArrayEquals(new int[]{0, 1}, TwoSum1.twoSumUsingMap(new int[]{1, 0, 1000, 10}, 1));
    }
}


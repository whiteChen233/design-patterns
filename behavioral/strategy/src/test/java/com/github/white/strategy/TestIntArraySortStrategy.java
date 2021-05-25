package com.github.white.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * The type Test sort strategy.
 */
public class TestIntArraySortStrategy {

    /**
     * Test sort.
     */
    @Test
    public void testSort() {
        try {
            int[] arr = {1, 5, 7, 3, 6, 8, 2, 0, 4};
            IntArraySorter.sort(arr, new BubbleSortStrategy());
            IntArraySorter.sort(arr, new InsertionSortStrategy());
            IntArraySorter.sort(arr, new SelectionSortStrategy());
        } catch (Exception e) {
            Assert.fail();
        }
    }
}

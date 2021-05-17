package com.github.white.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * The type Test sort strategy.
 */
public class TestSortStrategy {

    /**
     * Test sort.
     */
    @Test
    public void testSort() {
        try {
            int[] arr = {1, 5, 7, 3, 6, 8, 2, 0};
            Sorter.sort(arr, new BubbleSortStrategy());
            Sorter.sort(arr, new InsertionSortStrategy());
            Sorter.sort(arr, new SelectionSortStrategy());
        } catch (Exception e) {
            Assert.fail();
        }
    }
}

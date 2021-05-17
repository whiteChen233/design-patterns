package com.github.white.strategy;

import com.github.white.log.GlobalLogger;

/**
 * The type Insertion sort strategy.
 */
public class InsertionSortStrategy implements SortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     */
    @Override
    public void sort(int[] arr) {
        GlobalLogger.info("使用插入排序。。。");
    }

}

package com.github.white.strategy;

import com.github.white.log.GlobalLogger;

/**
 * The type Selection sort strategy.
 */
public class SelectionSortStrategy implements SortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     */
    @Override
    public void sort(int[] arr) {
        GlobalLogger.info("使用选择排序。。。");
    }
}

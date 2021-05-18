package com.github.white.strategy;

import java.util.Arrays;

import com.github.white.log.GlobalLogger;

/**
 * The type Sorter. 上下文 （Context） 维护指向具体策略的引用， 且仅通过策略接口与该对象进行交流。
 */
public class IntArraySorter {

    /**
     * Sort.
     *
     * @param arr          the arr
     * @param sortStrategy the sort strategy
     */
    static void sort(int[] arr, IntArraySortStrategy sortStrategy) {
        int[] result = sortStrategy.sort(arr);
        GlobalLogger.info("Sort: {}", Arrays.toString(result));
    }
}

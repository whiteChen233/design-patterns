package com.github.white.strategy;

import java.util.Arrays;

import com.github.white.log.GlobalLogger;

/**
 * The type Insertion sort strategy.
 */
public class InsertionSortStrategy implements IntArraySortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     */
    @Override
    public int[] sort(final int[] arr) {
        GlobalLogger.info("使用插入排序。。。");
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 1, len = result.length; i < len; i++) {
            if (result[i] < result[i - 1]) {
                int tmp = result[i];
                int j = i;
                while (j > 0 && tmp < result[j - 1]) {
                    result[j] = result[j - 1];
                    j--;
                }
                result[j] = tmp;
            }
        }
        return result;
    }

}

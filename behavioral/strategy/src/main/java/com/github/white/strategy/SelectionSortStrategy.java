package com.github.white.strategy;

import java.util.Arrays;

import com.github.white.log.GlobalLogger;

/**
 * The type Selection sort strategy.
 */
public class SelectionSortStrategy implements IntArraySortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     */
    @Override
    public int[] sort(final int[] arr) {
        GlobalLogger.info("使用选择排序。。。");
        int[] result = Arrays.copyOf(arr, arr.length);
        int min;
        int tmp;
        for (int i = 0, len = result.length; i < len - 1; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (result[min] > result[j]) {
                    min = j;
                }
            }
            tmp = result[min];
            result[min] = result[i];
            result[i] = tmp;
        }
        return result;
    }
}

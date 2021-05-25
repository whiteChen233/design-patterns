package com.github.white.strategy;

import java.util.Arrays;

import com.github.white.log.GlobalLogger;

/**
 * The type Bubble sort strategy. 具体策略 （Concrete Strategies） 实现了上下文所用算法的各种不同变体。
 */
public class BubbleSortStrategy implements IntArraySortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     */
    @Override
    public int[] sort(final int[] arr) {
        GlobalLogger.info("使用冒泡排序。。。");
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 1, len = result.length; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (result[j] > result[j + 1]) {
                    int tmp = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = tmp;
                }
            }
        }
        return result;
    }
}

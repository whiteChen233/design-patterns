package com.github.white.strategy;

import com.github.white.log.GlobalLogger;

/**
 * The type Bubble sort strategy. 具体策略 （Concrete Strategies） 实现了上下文所用算法的各种不同变体。
 */
public class BubbleSortStrategy implements SortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     */
    @Override
    public void sort(int[] arr) {
        GlobalLogger.info("使用冒泡排序。。。");
    }
}

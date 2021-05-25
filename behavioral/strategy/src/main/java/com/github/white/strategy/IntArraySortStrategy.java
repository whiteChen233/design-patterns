package com.github.white.strategy;

/**
 * The interface Sort strategy. 策略 （Strategy） 接口是所有具体策略的通用接口， 它声明了一个上下文用于执行策略的方法。
 */
public interface IntArraySortStrategy {

    /**
     * Sort.
     *
     * @param arr the arr
     * @return the int [ ]
     */
    int[] sort(final int[] arr);
}

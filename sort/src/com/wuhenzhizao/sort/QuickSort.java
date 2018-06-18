package com.wuhenzhizao.sort;

/**
 * 快速排序
 */
public class QuickSort {

    private int[] sort(int[] array) {

        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        array = new QuickSort().sort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

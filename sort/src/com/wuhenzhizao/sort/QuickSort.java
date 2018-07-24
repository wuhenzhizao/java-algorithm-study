package com.wuhenzhizao.sort;

/**
 * 快速排序
 */
public class QuickSort {

    private int partition(int[] array, int i, int j) {
        int basic = array[i], low = i, high = j;
        while (low < high) {
            while (low < high && array[high] >= basic) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= basic) {
                low++;
            }
            array[high] = array[low];
        }
        array[high] = basic;
        return high;
    }

    private void sort(int[] array, int low, int high) {
        if (low >= high) return;
        int index = partition(array, low, high);
        sort(array, 0, index - 1);
        sort(array, index + 1, high);
    }


    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        QuickSort sort = new QuickSort();
        sort.sort(array, 0, array.length - 1);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

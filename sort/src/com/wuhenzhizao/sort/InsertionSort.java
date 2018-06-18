package com.wuhenzhizao.sort;

/**
 * 插入排序
 */
public class InsertionSort {

    private int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        array = new InsertionSort().sort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

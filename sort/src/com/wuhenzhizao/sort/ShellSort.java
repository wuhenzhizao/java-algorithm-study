package com.wuhenzhizao.sort;

/**
 * 希尔排序
 */
public class ShellSort {

    private int[] sort(int[] array) {
        for (int increment = array.length / 2; increment > 0; increment /= 2) {
            // 组内插入排序
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - increment; j += increment) {
                    if (array[j] > array[j + increment]) {
                        int temp = array[j];
                        array[j] = array[j + increment];
                        array[j + increment] = temp;
                    }
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        array = new ShellSort().sort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

package com.wuhenzhizao.sort;

/**
 * 二分法插入排序
 */
public class BinaryInsertionSort {

    private int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int left = 0;
            int right = i - 1;
            int middle;
            while (left <= right) {
                middle = (left + right) / 2;
                if (temp < array[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                array[j + 1] = array[j];
            }
            if (left != i) {
                array[left] = temp;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        array = new BinaryInsertionSort().sort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

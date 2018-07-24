package com.wuhenzhizao.sort;

/**
 * 归并排序
 */
public class MergeSort {

    private void mergeSort(int[] array, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= high){
            if (array[i] < array[j]){
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= middle){
            temp[k++] = array[i++];
        }
        while (j <= high){
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, low, temp.length);
    }

    private void sort(int[] array, int low, int high) {
        if (low < high){
            int middle = (low + high) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            mergeSort(array, low, middle, high);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        new MergeSort().sort(array, 0, array.length - 1);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

package com.wuhenzhizao.sort;

/**
 * 堆排序
 */
public class HeapSort {

    private int[] sort(int[] array) {
        buildMaxHeap(array);
        for (int i = array.length - 1; i > 0; i--) {
            exchangeElements(array, 0, i);
            maxHeap(array, i, 0);
        }
        return array;
    }

    /**
     * 构建大堆
     *
     * @param array
     */
    private void buildMaxHeap(int[] array) {
        int half = (array.length - 1) / 2;
        for (int i = half; i >= 0; i--) {
            maxHeap(array, array.length, i);
        }
    }

    /**
     * 调整堆顺序
     *
     * @param array
     * @param length
     * @param i
     */
    private void maxHeap(int[] array, int length, int i) {
        int leftChildIndex = i * 2 + 1;
        int rightChildIndex = i * 2 + 2;
        int largest = i;
        if (leftChildIndex < length && array[leftChildIndex] > array[largest]) {
            largest = leftChildIndex;
        }
        if (rightChildIndex < length && array[rightChildIndex] > array[largest]) {
            largest = rightChildIndex;
        }
        if (largest != i) {
            // 子节点比父节点要大，则交换顺序
            exchangeElements(array, i, largest);
            // 调整子树堆顺序
            maxHeap(array, length, largest);
        }
    }

    /**
     * 交换指定元素
     *
     * @param array
     * @param a
     * @param b
     */
    private void exchangeElements(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 0, 3, -1, 33, 99, 71, 10, 1, -22, 88, 50, 22, 10};
        array = new HeapSort().sort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }
}

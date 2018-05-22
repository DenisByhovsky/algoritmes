package com.byhovsky.algoritmes;

import java.util.Arrays;

/**
 * Quick sort
 *
 * @author Denis Byhovsky
 */
public class QuickSort {

    int[] array1 = {1, 12, 3, -1, 0, 34, 1, 9, 3, -13};

    private static void quickSortFunc(int[] startArray, int startIndex, int endIndex) {
        if (startArray.length == 0)
            return;
        if (startIndex >= endIndex)
            return;

        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        int oporElem = startArray[middleIndex];

        int i = startIndex, j = endIndex;
        while (i <= j) {
            while (startArray[i] < oporElem) {
                i++;
            }
            while (startArray[j] > oporElem) {
                j--;
            }
            if (i <= j) {
                int temp = startArray[i];
                startArray[i] = startArray[j];
                startArray[j] = temp;
                i++;
                j--;
            }
        }
        if (startIndex < j)
            quickSortFunc(startArray, startIndex, j);

        if (endIndex > i)
            quickSortFunc(startArray, i, endIndex);
    }

    public void printQuickSort() {
        int low = 0;
        int high = array1.length - 1;
        quickSortFunc(array1, low, high);
        System.out.println(Arrays.toString(array1));
    }
}


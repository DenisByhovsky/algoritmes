package com.byhovsky.algoritmes;

import java.util.Arrays;

/**
 * Merge sort
 *
 * @author Denis Byhovsky
 */
public class MergeSort {

    int[] array1 = {1, 12, 3, -1, 0, 34, 1, 9, 3, -13};

    public MergeSort() {
    }

    public int[] mergeSortFunc(int[] array) {
        int[] bufferOne = Arrays.copyOf(array, array.length);
        int[] bufferTwo = new int[array.length];
        int[] resultArray = mergeSortFuncIn(bufferOne, bufferTwo, 0, array.length);
        return resultArray;
    }

    public static int[] mergeSortFuncIn(int[] bufferOne, int[] bufferTwo, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return bufferOne;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sortedOne = mergeSortFuncIn(bufferOne, bufferTwo, startIndex, middle);
        int[] sortedTwo = mergeSortFuncIn(bufferOne, bufferTwo, middle, endIndex);

        int indexOne = startIndex;
        int indexTwo = middle;
        int resultIndex = startIndex;
        int[] resultArray = sortedOne;
        if (resultArray == bufferOne) {
            resultArray = bufferTwo;
        } else {
            resultArray = bufferOne;
        }

        while (indexOne < middle && indexTwo < endIndex) {
            resultArray[resultIndex++] = sortedOne[indexOne] < sortedTwo[indexTwo] ? sortedOne[indexOne++] : sortedTwo[indexTwo++];
        }
        while (indexOne < middle) {
            resultArray[resultIndex++] = sortedOne[indexOne++];
        }
        while (indexTwo < endIndex) {
            resultArray[resultIndex++] = sortedTwo[indexTwo++];
        }
        return resultArray;
    }

    public void printMergeSort() {
        int[] result = mergeSortFunc(array1);
        System.out.println(Arrays.toString(result));

    }
}

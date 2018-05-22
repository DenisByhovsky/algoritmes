package com.byhovsky.algoritmes;

import java.util.Arrays;

/**
 * Insertion sort
 *
 * @author Denis Byhovsky
 */
public class InsertSort {

    int[] array1 = {1, 12, 3, -1, 0, 34, 1, 9, 3, -13};

    public InsertSort() {
    }

    public int[] insertSortFunc(int[] startArray) {
        int[] resultArray = new int[startArray.length];
        int resultSize = 0;

        for (int n = 0; n < startArray.length; n++) {
            int insertIndex = 0;
            if (resultSize > 0) {
                while (insertIndex < resultSize && resultArray[insertIndex] < startArray[n])
                    insertIndex++;
            }
            for (int k = resultSize - 1; k >= insertIndex; k--) {
                resultArray[k + 1] = resultArray[k];
            }
            resultArray[insertIndex] = startArray[n];
            resultSize++;
        }
        return resultArray;
    }

    public void printInsSort() {
        int[] result = new InsertSort().insertSortFunc(array1);
        System.out.println(Arrays.toString(result));
    }
}

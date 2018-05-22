package com.byhovsky.algoritmes;

/**
 * Binary Search
 *
 * @author Denis Byhovsky
 */
public class BinarySearch {
    public static int KEY_N = 2;
    int[] data = {1, 12, 3, -1, 0, 34, 1, 9, 3, -13};

    public boolean binarySearchFunc(int key) {
        int low = 0;
        int high = data.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;
            }
            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }

    public void printAllBin() {
        System.out.println(new BinarySearch().binarySearchFunc(KEY_N));
    }
}

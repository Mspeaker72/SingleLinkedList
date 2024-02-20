package org.example;

/**
 * The MergeSort class provides methods for sorting arrays using the Merge Sort algorithm.
 */
public class MergeSort {

    /**
     * Sorts the given array using the Merge Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return The sorted array.
     */
    public int[] SortArray(int[] arr) {
        //naive sorted
        if (arr.length <= 1) {
            return arr;
        }
        int[] left = SortArray(splitLeft(arr));
        int[] right = SortArray(splitright(arr));

        return combine(left, right);
    }

    /**
     * Combines two sorted arrays into a single sorted array.
     *
     * @param left  The left sorted array.
     * @param right The right sorted array.
     * @return The combined sorted array.
     */
    private int[] combine(int[] left, int[] right) {
        int[] sort = new int[(left.length + right.length)];
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                sort[i + j] = left[i];
                i += 1;
            } else {

                sort[i + j] = right[j];
                j += 1;
            }
        }

        while (i < left.length) {
            sort[i + j] = left[i];
            i += 1;
        }

        while (j < right.length) {
            sort[i + j] = right[j];
            j += 1;
        }

        return sort;
    }

    /**
     * Checks if the elements in the array are in ascending order.
     *
     * @param arr   The array to be checked.
     * @param index The starting index for checking.
     * @return True if the array elements are in ascending order, false otherwise.
     */
    private boolean verifyOrder(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return verifyOrder(arr, index + 1);
    }

    /**
     * Splits the array into the right part.
     *
     * @param arr The array to be split.
     * @return The right part of the array.
     */
    public int[] splitright(int[] arr) {
        int mid = arr.length / 2;
        int pos = mid;
        if (arr.length % 2 != 0) {
            pos = mid + 1;
        }
        int[] right = new int[pos];

        for (int i = mid; i <= arr.length - 1; i++) {
            right[i - mid] = arr[i];
        }
        return right;
    }

    /**
     * Splits the array into the left part.
     *
     * @param arr The array to be split.
     * @return The left part of the array.
     */
    public int[] splitLeft(int[] arr) {

        int mid = arr.length / 2;

        int[] left = new int[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        return left;
    }
}


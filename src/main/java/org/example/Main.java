package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
       MergeSort mergeSort = new MergeSort();

       int[] arr = {3,6,12,8,9,7,1,9,10,12,32};


        System.out.println(Arrays.toString(mergeSort.SortArray(arr)));

    }
}

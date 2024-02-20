package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
       MergeSort mergeSort = new MergeSort();

       int[] arr = {3,6,8,9,6,7,9,10,1,12};


        System.out.println(Arrays.toString(mergeSort.SortArray(arr)));

    }
}

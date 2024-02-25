package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    //last index pivot
    // two pointers one at start i and j before start -1
    // temp check values


    public void quicksort(int[]arr , int start , int end){

        if(end<=start){
            System.out.println(Arrays.toString(arr));
            return;

        }

        int pivot = parition(arr, start, end);
        //find position of the pivot
        quicksort(arr, start, pivot-1);
        quicksort(arr, pivot+1, end);

    }

    private int parition(int[]arr , int start , int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }




}




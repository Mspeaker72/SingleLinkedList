package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
      SelectionSort selectionSort = new SelectionSort();

       int[] arr = {72,1,1,1,2,10,3,6,5,1};



        System.out.println(Arrays.toString(selectionSort.selectSort(arr)));



    }
}

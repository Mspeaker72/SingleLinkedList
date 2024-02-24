package org.example;

public class SelectionSort {

    //get list find the mininum
    // remove add it to new list



    public int[] selectSort(int[]arr){

        int[] newArr = new int[arr.length];
        int size = arr.length;
        int start = 0;

        if(arr.length<=1){
            return arr;
        }

        if(isSorted(arr,0)){
            return arr;
        }

        while(start<size){

            int min = findMin(arr);

            newArr[start]= min;
            start++;

            arr = rebuild(arr,min);
        }

       return newArr;
    }

    private int[] rebuild(int[] arr, int min) {

        int[] shrink = new int[arr.length-1];
        int j =0;
        boolean removedFirst= false;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==min && !removedFirst){
                removedFirst=true;
                continue;
            }
            shrink[j] =arr[i];
            j++;
        }
        return shrink;
    }


    private boolean isSorted(int[]arr,  int index){

        if(index==arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1]){
            return false;
        }

        return isSorted(arr,index+1);

    }

    private int  findMin(int[]arr){

        int currentMin = arr[0];

        for (int j : arr) {
            if (j < currentMin) {
                currentMin = j;
            }
        }
        return currentMin;
    }






}

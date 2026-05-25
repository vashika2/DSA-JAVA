package com.Vashika;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,3,45,14,-2,65};
        int target = 14;
        System.out.println(linearSearch(arr,target,1,4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}

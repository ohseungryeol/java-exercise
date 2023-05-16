package week5.d2;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int min = arr[i];
            int idx =i;
            for (int j= i+1; j<arr.length; j++){
                if(min>arr[j]){
                    min = arr[j];
                    idx=j;
                }
            }
            int temp = arr[i];
            arr[i]=min;
            arr[idx]=temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        SelectionSort so = new SelectionSort();
        arr = so.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

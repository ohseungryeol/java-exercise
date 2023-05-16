package week5.d2;

import java.util.Arrays;

public class InsertionSort { //삽입정렬
    public int[] sort(int[] arr, boolean isAsc){


        for (int i=1; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if((isAsc==true)? arr[j]<arr[j-1] : arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                } else{
                    break;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        return  sort(arr,false);
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

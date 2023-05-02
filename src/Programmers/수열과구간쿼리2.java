package Programmers;

import java.util.Arrays;

public class 수열과구간쿼리2 {
    public static void main(String[] args) {
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] arr = {0,1,2,4,3};
        String an="";
        int[] answer = new int[3];
        int idx=0;
        for (int[] q: queries){
            int i =q[0]; //인덱스
            int j =q[1];
            int k =q[2]; //기준
            int min = Integer.MAX_VALUE;

            boolean flag = false;
            for (int s=i; s<=j; s++){
                if(arr[s]>k){
                    if (arr[s]<min) min = arr[s];
                    flag = true;
                }
            }
            if(flag == false){
                answer[idx++]=-1;
            } else{
                //System.out.println(min);
                answer[idx++]=min;
            }


        }
        System.out.println(Arrays.toString(answer));
    }
}

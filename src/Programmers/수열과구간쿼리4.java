package Programmers;

import java.util.Arrays;

public class 수열과구간쿼리4 {
    public static void main(String[] args) {
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        int[] arr = {0,1,2,4,3};

        for (int i=0; i<queries.length; i++){
            int[] q= queries[i];
            int start = q[0];
            int end = q[1];
            int k = q[2];

            for (int j=start; j<=end; j++){
                if(j%k==0){
                    arr[j]+=1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

package CodeUp;

import java.util.Scanner;

public class 홀수의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int oddSum =0;
        for (int i=1; i<=n; i++){ //1부터 n까지 홀수의 합 구하기
            if(i%2!=0){
                oddSum+=i;
            }
        }

        System.out.println(oddSum);
    }
}

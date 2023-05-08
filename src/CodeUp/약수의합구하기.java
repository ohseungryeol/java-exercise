package CodeUp;

import java.util.Scanner;

public class 약수의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int divisorSum=0;

        for (int i=1; i<=n; i++){//1부터 n까지 n의 약수들의 합 구하기
            if(n%i==0){
                divisorSum+=i;
            }
        }

        System.out.println(divisorSum);
    }
}

package CodeUp;

import java.util.Scanner;

public class 소수판별1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<2){
            System.out.println("소수가 아닙니다.");
        } else if (n==2){
            System.out.println("소수입니다.");
        } else {
            for (int i=2; i<n; i++){
                if(n%i==0){
                    System.out.println("소수가 아님");
                    return; //약수를 가지고 있으면 소수이므로 종료
                }
            }
            System.out.println("소수입니다."); // 위 반복문에서 main함수가 종료되지 못했다면 소수
        }
    }
}

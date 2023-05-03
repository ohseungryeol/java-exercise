package CodeUp;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int i=1;
        int sum=0;

        while(sum<n){
            sum+=i++;
        }

        System.out.println(sum);
    }
}

package CodeUp;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        /*
        ** 2*1
        **** 2*2
        ****** 2*3
         */

        for (int i=1; i<=9; i++){
            for (int j=1; j<=i*n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

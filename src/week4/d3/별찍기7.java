package week4.d3;

import java.util.Scanner;

public class 별찍기7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i=1; i<=h; i++){
            for (int j=h; j>i; j--){
                System.out.print(" ");
            }

            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=h-1; i>0; i--){
            for (int j=0; j<h-i; j++){
                System.out.print(" ");
            }

            for (int j=2*i-1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

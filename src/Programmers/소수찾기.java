package Programmers;

import java.util.ArrayList;

public class 소수찾기 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7];
    public static void main(String[] args) {
        String numbers = "011";
        DFS(numbers);
    }

    static void DFS (String tmp){
        char[] ch = tmp.toCharArray();
        String num = "";
        for (int i=0; i<ch.length; i++){

        }
    }

    static boolean isPrime(int n){
        if (n<2){
            return false;
        } else {
            for (int i=2; i<=n/2; i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}

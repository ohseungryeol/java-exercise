package CodeUp;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[10][10];
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                board[i][j]= sc.nextInt();
            }
        }
        // 1,1 이 개미 위치
        int rIdx =1;
        int cIdx =1;
        int i=1;
        int j=1;
        boolean flag = false;
        for (i=1; i<10; i++){
            if(flag==true) break;
            for (j=cIdx; j<10; j++){ //1
                if(board[i][j]==0){
                    board[i][j]=9;
                } else if (board[i][j]==1){
                    cIdx = j-1;
                    break;
                } else if (board[i][j]==2){
                    board[i][j]=9;
                    flag =true;
                    break;
                }
            }
        }

        for (int r=0; r<10; r++){
            for (int c=0; c<10; c++){
                System.out.print(board[r][c]+" ");
            }
            System.out.println();
        }

    }
}

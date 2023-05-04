package CodeUp;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[20][20];

        for (int i=1; i<=19; i++){
            for (int j=1; j<=19; j++){
                board[i][j]= sc.nextInt();
            }
        }

        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            colChange(r,board);
            rowChange(c,board);
        }

        for (int i=1; i<=19; i++){
            for (int j=1; j<=19; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void colChange(int r, int[][] board){
        for (int j=1; j<=19; j++){
            if(board[r][j]==0){
                board[r][j]=1;
            } else{
                board[r][j]=0;
            }
        }
    }

    public static void rowChange(int c, int[][] board){
        for (int j=1; j<=19; j++){
            if(board[j][c]==0){
                board[j][c]=1;
            } else{
                board[j][c]=0;
            }
        }
    }
}

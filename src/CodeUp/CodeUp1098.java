package CodeUp;

import java.util.*;

public class CodeUp1098 {
    private int h;
    private int w;
    private int[][] board;

    public CodeUp1098(int h, int w) {
        this.h = h;
        this.w = w;
        init(w,h);
    }

    public void init(int w, int h){
        board = new int[w + 1][h + 1];
    }

    public void setBoard(int L, int d, int x, int y){ //막대 갯수
        if (d==0){ //가로 막대
            for (int i=y; i<y+L; i++){
                board[x][i]=1;
            }
        } else { // 세로 막대
            for (int i=x; i<x+L; i++){
                board[i][y]=1;
            }
        }
    }

    public void printBoard(){
        for (int i=1; i<=w; i++){
            for (int j=1; j<=h; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        CodeUp1098 bo = new CodeUp1098(h,w);

        int n =sc.nextInt();
        for (int i=0; i<n; i++){
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            bo.setBoard(l,d,x,y);
        }

        bo.printBoard();

    }

}

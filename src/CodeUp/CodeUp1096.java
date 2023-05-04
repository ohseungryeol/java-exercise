package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1096 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[20][20];

        int N = Integer.parseInt(br.readLine()); // 흰돌 갯수
        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rIdx = Integer.parseInt(st.nextToken());
            int cIdx = Integer.parseInt(st.nextToken());
            board[rIdx][cIdx]=1;
        }

        for (int i=1; i<=19; i++){
            for (int j=1; j<=19; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}

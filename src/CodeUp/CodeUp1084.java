package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt =0;

        for (int i=0; i<r; i++){
            for (int j=0; j<g; j++){
                for (int k=0; k<b; k++){
                    System.out.printf("%d %d %d\n",i,j,k);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}

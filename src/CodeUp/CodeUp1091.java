package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());//곱할 값
        int d = Integer.parseInt(st.nextToken());//더할 값
        int e = Integer.parseInt(st.nextToken());

        int j=1;
        for (long i=s; j<=e; i=i*m+d){
            if(j==e) System.out.println(i);
            j++;
        }

    }
}

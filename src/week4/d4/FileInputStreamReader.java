package week4.d4;

import java.io.*;

public class FileInputStreamReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./hospital_info_0920.csv"),"EUC-KR"));
        System.out.println(br.readLine());
    }
}

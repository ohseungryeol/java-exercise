package week4.d4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class ReadFileEx {
    public List<String> getLines(String fileName){
        List<String> lines = new LinkedList<>();
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get("./hospital_info_0920_UTF-8.csv"), StandardCharsets.UTF_8)){
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }

    public Hospital parse(String str) {
        String[] splited = str.split(",");
        Address address = new Address(splited[10],splited[5],splited[7]);
        Hospital hospital = new Hospital(splited[1], splited[11], address);
        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();

        for (String line: lines){
            hospitals.add(parse(line)); //hospital 객체 추가 -> parse함수 호출
        }

        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx();
        List<String> strLines = rfe.getLines("hospital_info_0920_UTF-8.csv");
        /*for (int i=0; i<10; i++){
            System.out.println(strLines.get(i));
        }*/
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        for (int i = 0; i < 10; i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(),
                    hospital.getAddress().getFullAddr());
        }

    }
}

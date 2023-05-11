package CodeUp;

import java.util.*;

public class CodeUp3108 {
    static class Student implements Comparable<Student>{
        int testNumber;
        String name;

        public Student( int testNumber, String name) {
            this.testNumber = testNumber;
            this.name = name;
        }

        @Override
        public int compareTo(Student o) {
            return this.testNumber-o.testNumber;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> arr = new ArrayList<>();
        int[] check= new int[10001];
        for (int i=0; i<n; i++){
            String code = sc.next();
            int testNumber = sc.nextInt();
            String name = sc.next();

            if (code.equals("I") && check[testNumber]==0){ // 중복 수험번호 확인 -> 이미 check이면 아무것도 하지않음
                check[testNumber]=1;
                arr.add(new Student(testNumber, name));
            } else if (code.equals("D")){
               for (int j=0; j<arr.size(); j++){
                   if(arr.get(j).testNumber==testNumber){ //
                       arr.remove(j);
                       check[testNumber]=0;
                   }
               }
            }
        }

        Collections.sort(arr); //수험번호 오름차순 정렬




        for (int i=0; i<5; i++){
            int num = sc.nextInt()-1;
            System.out.println(arr.get(num).testNumber+" "+arr.get(num).name);
        }
    }
}

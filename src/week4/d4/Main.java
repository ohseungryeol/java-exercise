package week4.d4;

import java.util.*;

public class Main {
    private List<Student> info = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.process();
    }

    public boolean isExist(int testNumber) {
        //info 리스트에 입력받은 수험번호가 있다면 True
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getTestNumber() == testNumber) return true;
        }

        return false;
    }

    public void deleteStudent(int testNumber) {
        //info 리스트를 전체 탐색하면서 입력받은 수험번호가 존재 한다면 리스트에서 삭제한다.
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getTestNumber() == testNumber) {
                info.remove(i);
            }
        }
    }

    public void process() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String code = sc.next();
            int testNumber = sc.nextInt();
            String name = sc.next();

            if (code.equals("I")) { // 리스트에 해당 수험번호가 존재하지 않으면 추가
                if (!isExist(testNumber)) info.add(new Student(testNumber, name));
            } else {
                deleteStudent(testNumber);
            }
        }

        Collections.sort(info);

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt() - 1;
            System.out.println(info.get(num).getTestNumber() + " " + info.get(num).getName());
        }
    }

}

class Student implements Comparable<Student> {

    private int testNumber;
    private String name;

    public Student(int testNumber, String name) {
        this.testNumber = testNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.testNumber - o.testNumber;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public String getName() {
        return name;
    }
}


package week4.d4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List arr = new ArrayList<>(); //재네릭 타입을 명시하지 않으면 메모리를 많이 잡아먹는다

        arr.add("asdasd");
        arr.add(30.0);
        arr.add('c');

        for (var item: arr){
            System.out.println(item);
        }
    }
}

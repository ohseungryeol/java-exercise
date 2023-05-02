package CodeUp;

class Parent {
    static int i =1;
    int x = 100;

    Parent() {
        this(500);
        System.out.println("Parent 기본 생성자"+i++);
    }
    Parent(int x) {
        System.out.println("Parent 매개변수 생성자 호출 "+ i++);
        this.x = x;
    }
    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 4000;
    Child() {
        //System.out.println("Child 기본 생성자 호출");
        this(5000); //2
        System.out.println("Child 기본 생성자"+i++);
    }
    Child(int x) {
        System.out.println("Child 매개변수 생성자 호출 "+ i++);
        this.x = x;
    }

}

public class Main {

    public static void main(String[] args) {

        Child obj = new Child(); //1

        System.out.println(obj.getX());

    }

}


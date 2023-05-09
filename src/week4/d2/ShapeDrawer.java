package week4.d2;

public abstract class ShapeDrawer {

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public abstract String makeALine(int h, int i); //추상클래스는 반드시 구현해서 사용
}

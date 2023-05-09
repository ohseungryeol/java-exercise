package week4.d2;

public class PyramidShapeDrawer extends ShapeDrawer{
    @Override //추상 메서드 구현부
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }
}

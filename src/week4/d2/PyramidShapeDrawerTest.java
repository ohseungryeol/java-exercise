package week4.d2;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {
       /* ShapeDrawer pyramidDrawer = new PyramidShapeDrawer();
        pyramidDrawer.printShape(4);*/
        ParallelogramShapeDrawer parallelogramShapeDrawer = new ParallelogramShapeDrawer();
        ShapeDrawer shape = new ParallelogramShapeDrawer();

        parallelogramShapeDrawer.printShape(4);
        shape.printShape(4);
    }
}

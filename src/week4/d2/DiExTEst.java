package week4.d2;

public class DiExTEst {
    public static void main(String[] args) {
        DiEx pyramid= new DiEx(new PyramidShapeDrawer());
        pyramid.doSth(5);

        DiEx parallel = new DiEx(new ParallelogramShapeDrawer());
        parallel.doSth(5);
    }
}

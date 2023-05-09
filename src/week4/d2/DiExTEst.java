package week4.d2;

public class DiExTEst {
    public static void main(String[] args) {
        DiEx di = new DiEx(new PyramidShapeDrawer());
        di.doSth(5);

        DiEx di2 = new DiEx(new ParallelogramShapeDrawer());
        di2.doSth(5);
        di2.hello();
    }
}

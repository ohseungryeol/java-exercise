package week4.d2;

public class DiEx {
    private ShapeDrawer shapeDrawer;  //상위 클래스 (추상클래스 혹은 인터페이스)로 파라미터를 받아야지 기능별 하위클래스를 사용할 수 있음.
    //상위 클래스 타입으로 멤버 변수를 선언해야지 하위 클래스 객체 종류별로 사용하는 것이 가능하다...!
    // 멤버변수를 하위클래스로 선언 해버리면 그 하위클래스 구현체밖에 사용못함 ,,
    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void doSth(int h){
        shapeDrawer.printShape(h);
    }
}

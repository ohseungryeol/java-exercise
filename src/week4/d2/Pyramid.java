package week4.d2;

public class Pyramid {
    String spade;
    public Pyramid(String spade){
        this.spade=spade;
    }
    public void printPyramid(int height){
        for (int i=0; i<height; i++){
            System.out.println(makeALine(i,height));
        }
    }

    public String makeALine(int i, int height){
        return spade.repeat(height-i-1)+"*".repeat(2*i+1);
    }
    public static void main(String[] args) {
        Pyramid p1 = new Pyramid("0");
        p1.printPyramid(4);
        Pyramid p2 = new Pyramid(" ");
        p2.printPyramid(5);
    }
}

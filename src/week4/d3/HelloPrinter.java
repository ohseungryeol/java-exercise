package week4.d3;

import java.io.IOException;

public class HelloPrinter implements Printer {
    private Printer printer;

    public HelloPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message){
        System.out.println(message+","+"hello");
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i=0; i<n; i++){
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(5,"sujin");
    }
}

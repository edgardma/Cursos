package pe.com.dyd.clase.example.srp;

public class StandardOutputPrinter implements Printer {
    @Override
    public void printPage(String page) {
        System.out.println(page);
    }
}

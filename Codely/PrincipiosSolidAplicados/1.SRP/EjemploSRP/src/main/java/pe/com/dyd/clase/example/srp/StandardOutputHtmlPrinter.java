package pe.com.dyd.clase.example.srp;

public class StandardOutputHtmlPrinter implements Printer {
    @Override
    public void printPage(String page) {
        System.out.println("<div>" + page + "</div>");
    }
}

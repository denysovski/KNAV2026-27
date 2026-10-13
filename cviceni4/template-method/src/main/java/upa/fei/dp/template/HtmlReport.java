package upa.fei.dp.template;

public class HtmlReport extends ReportGenerator {
    @Override
    protected String formatName() { return "HTML"; }

    @Override
    protected void header(String title) {
        System.out.println("<h1>" + title + "</h1>");
    }

    @Override
    protected void line(String row) {
        System.out.println("<p>" + row + "</p>");
    }

    @Override
    protected void footer(int count) {
        System.out.println("<footer>Pocet radku: " + count + "</footer>");
    }
}

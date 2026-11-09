package upa.fei.dp.template;

public class HtmlReport extends ReportGenerator {
    @Override
    protected String formatName() { return "HTML"; }

    @Override
    protected String header(String title) {
        return "<h1>" + escape(title) + "</h1>";
    }

    @Override
    protected String line(String row) {
        return "<p>" + escape(row) + "</p>";
    }

    @Override
    protected String footer(int count) {
        return "<footer>Pocet radku: " + count + "</footer>";
    }

    private static String escape(String text) {
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
}

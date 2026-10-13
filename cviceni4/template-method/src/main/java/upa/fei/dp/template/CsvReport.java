package upa.fei.dp.template;

public class CsvReport extends ReportGenerator {
    @Override
    protected String formatName() { return "CSV"; }

    @Override
    protected void header(String title) {
        System.out.println("nazev;" + title);
    }

    @Override
    protected void line(String row) {
        System.out.println("radek;" + row);
    }

    @Override
    protected boolean hasFooter() { return false; }
}

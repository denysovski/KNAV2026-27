package upa.fei.dp.template;

public class CsvReport extends ReportGenerator {
    @Override
    protected String formatName() { return "CSV"; }

    @Override
    protected String header(String title) {
        return "nazev;" + quote(title);
    }

    @Override
    protected String line(String row) {
        return "radek;" + quote(row);
    }

    @Override
    protected boolean hasFooter() { return false; }

    private static String quote(String value) {
        if (value.contains(";") || value.contains("\"")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }
}

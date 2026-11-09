package upa.fei.dp.template;

public class TextReport extends ReportGenerator {
    @Override
    protected String formatName() { return "TXT"; }

    @Override
    protected String header(String title) {
        return title.toUpperCase() + "\n-----------";
    }

    @Override
    protected String line(String row) {
        return "* " + row;
    }
}

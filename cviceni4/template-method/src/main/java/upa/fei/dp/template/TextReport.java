package upa.fei.dp.template;

public class TextReport extends ReportGenerator {
    @Override
    protected String formatName() { return "TXT"; }

    @Override
    protected void header(String title) {
        System.out.println(title.toUpperCase());
        System.out.println("-----------");
    }

    @Override
    protected void line(String row) {
        System.out.println("* " + row);
    }
}

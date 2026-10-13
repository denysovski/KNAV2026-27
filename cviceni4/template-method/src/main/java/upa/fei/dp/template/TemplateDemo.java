package upa.fei.dp.template;

public class TemplateDemo {
    public static void main(String[] args) {
        String[] rows = { "Kamion - 12 zasilek", "Lod - 3 zasilky", "Letadlo - 7 zasilek" };

        ReportGenerator[] generators = {
            new TextReport(), new HtmlReport(), new CsvReport()
        };

        for (ReportGenerator g : generators) {
            g.generate("Prehled dopravy", rows);
        }
    }
}

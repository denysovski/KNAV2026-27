package upa.fei.dp.template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TemplateDemo {
    public static void main(String[] args) {
        List<String> rows = Arrays.asList("Kamion - 12 zasilek", "Lod - 3 zasilky", "Letadlo - 7 zasilek");

        ReportGenerator[] generators = {
            new TextReport(), new HtmlReport(), new CsvReport()
        };

        for (ReportGenerator g : generators) {
            System.out.println(g.generate("Prehled dopravy", rows));
        }

        System.out.println("--- Zvlastni znaky ---");
        List<String> special = Arrays.asList("a < b & c", "Praha; Brno");
        System.out.println(new HtmlReport().generate("Test", special));
        System.out.println(new CsvReport().generate("Test", special));

        System.out.println("--- Kontrola vstupu ---");
        ReportGenerator report = new TextReport();
        try {
            report.generate(null, rows);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            report.generate("Nadpis", Collections.emptyList());
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            report.generate("Nadpis", Arrays.asList("ok", null));
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

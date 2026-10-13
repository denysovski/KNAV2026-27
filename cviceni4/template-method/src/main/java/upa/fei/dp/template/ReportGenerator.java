package upa.fei.dp.template;

public abstract class ReportGenerator {

    public final void generate(String title, String[] rows) {
        System.out.println("=== Generuji " + formatName() + " ===");
        header(title);
        for (String row : rows) {
            line(row);
        }
        if (hasFooter()) {          // hook
            footer(rows.length);
        }
        System.out.println();
    }

    protected abstract String formatName();
    protected abstract void header(String title);
    protected abstract void line(String row);

    protected boolean hasFooter() { return true; }
    protected void footer(int count) {
        System.out.println("Pocet radku: " + count);
    }
}

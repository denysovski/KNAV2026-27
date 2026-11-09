package upa.fei.dp.template;

import java.util.List;
import java.util.Objects;

public abstract class ReportGenerator {

    public final String generate(String title, List<String> rows) {
        String cleanTitle = Check.text(title, "title");
        Objects.requireNonNull(rows, "rows nesmi byt null");
        if (rows.isEmpty()) {
            throw new IllegalArgumentException("rows nesmi byt prazdne");
        }
        for (String row : rows) {
            Check.text(row, "radek reportu");
        }

        StringBuilder out = new StringBuilder();
        out.append("=== Generuji ").append(formatName()).append(" ===\n");
        out.append(header(cleanTitle)).append('\n');
        for (String row : rows) {
            out.append(line(row.trim())).append('\n');
        }
        if (hasFooter()) {
            out.append(footer(rows.size())).append('\n');
        }
        return out.toString();
    }

    protected abstract String formatName();
    protected abstract String header(String title);
    protected abstract String line(String row);

    protected boolean hasFooter() { return true; }
    protected String footer(int count) {
        return "Pocet radku: " + count;
    }
}

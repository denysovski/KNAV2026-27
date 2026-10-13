package upa.fei.dp.adapter;

public class LegacyBank {
    public void makeTransfer(String account, long cents) {
        System.out.println("LegacyBank: prevod " + cents + " haleru z uctu " + account);
    }
}

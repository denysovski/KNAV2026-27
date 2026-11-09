package upa.fei.dp.adapter;

public class LegacyBank {

    public boolean makeTransfer(String account, long cents) {
        if (account == null || !account.matches("\\d{1,10}/\\d{4}")) {
            System.out.println("LegacyBank: neplatne cislo uctu " + account);
            return false;
        }
        if (cents <= 0) {
            System.out.println("LegacyBank: castka musi byt kladna");
            return false;
        }
        System.out.println("LegacyBank: prevod " + cents + " haleru z uctu " + account);
        return true;
    }
}

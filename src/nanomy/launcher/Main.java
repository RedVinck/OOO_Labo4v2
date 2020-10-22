package nanomy.launcher;

import nanomy.domain.db.Bank;
import nanomy.domain.model.Rekening;
import nanomy.domain.observers.Auditor;
import nanomy.domain.observers.RekeningLogger;

public class Main {
    public static void main(String[] args) {
        Bank bank =new Bank();
        Rekening nieuweKlant = new Rekening(5915,196);
        bank.addObserver(new Auditor());
        bank.addObserver(new RekeningLogger());
        bank.add(nieuweKlant);
        System.out.println(bank.toString());
    }
}

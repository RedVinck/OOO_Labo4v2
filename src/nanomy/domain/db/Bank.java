package nanomy.domain.db;

import nanomy.domain.model.Rekening;
import nanomy.domain.observers.Auditor;
import nanomy.domain.observers.Observer;
import nanomy.domain.observers.RekeningLogger;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    ArrayList<Rekening> Rekeningen = new ArrayList<Rekening>();
    List<Observer> Observers = new ArrayList<>() ;



    public Bank() {
        Observers.add(new Auditor());
        Observers.add(new RekeningLogger());

    }
    public void add(Rekening rekening){
        this.Rekeningen.add(rekening);
        for (Observer observer : this.Observers) {
            observer.update(rekening);
        }
    }


    public void addObserver(Observer observer) {
     this.Observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.Observers.remove(observer);
    }


    public static void main(String[] args) {
        Bank bank =new Bank();
        Rekening nieuweKlant = new Rekening(5915,196);
        bank.add(nieuweKlant);
    }
}

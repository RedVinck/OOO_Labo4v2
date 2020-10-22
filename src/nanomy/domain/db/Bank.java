package nanomy.domain.db;

import javafx.beans.InvalidationListener;
import nanomy.domain.model.Rekening;
import nanomy.domain.observers.Auditor;
/*import nanomy.domain.observers.Observer;*/
import nanomy.domain.observers.RekeningLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Bank extends Observable {
    ArrayList<Rekening> Rekeningen = new ArrayList<Rekening>();



    public Bank() {

    }

    public void add(Rekening rekening){
        this.Rekeningen.add(rekening); setChanged();
        setChanged();
        notifyObservers(rekening);
    }

    public ArrayList<Rekening> getRekeningen() {
        return Rekeningen;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Rekeningen=" + Rekeningen +
                '}';
    }
}

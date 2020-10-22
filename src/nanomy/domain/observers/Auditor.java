package nanomy.domain.observers;

import nanomy.domain.model.Rekening;

import java.util.Observable;
import java.util.Observer;

public class Auditor implements Observer {


    @Override
    public void update(Observable bank, Object rekening) {
        if (rekening instanceof Rekening){
            System.out.println("Nieuwe rekening geopend op datum "+((Rekening) rekening).getStartdate()+ " " +
                    "met nummer "+((Rekening) rekening).getRekeningnummer()+" en saldo " +((Rekening) rekening).getBalans());}
        else System.out.println("test");

    }
}

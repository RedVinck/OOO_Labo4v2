package nanomy.domain.observers;

import nanomy.domain.model.Rekening;

public class Auditor implements Observer{
    @Override
    public void update(Object o) {
        if (o instanceof Rekening){
        System.out.println("Nieuwe rekening geopend op datum "+((Rekening) o).getStartdate()+ " " +
                "met nummer "+((Rekening) o).getRekeningnummer()+" en saldo " +((Rekening) o).getBalans());}
    }
}

package nanomy.domain.observers;

import nanomy.domain.model.Rekening;

import javax.swing.plaf.IconUIResource;

public class RekeningLogger implements Observer{
    private  int Count =0;
    @Override
    public void update(Object o) {
        if (o instanceof Rekening){
            Count +=1;
            System.out.println("Het nieuwe rekeningsnummer is: "+((Rekening) o).getRekeningnummer() +" nu heeft de bank"+ Count+" aantal rekeningen");
        }

    }
}

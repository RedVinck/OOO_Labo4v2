package nanomy.domain.observers;

import nanomy.domain.model.Rekening;

import javax.swing.plaf.IconUIResource;
import java.util.Observable;
import java.util.Observer;

public class RekeningLogger implements Observer {
    private  int Count =0;
    @Override
    public void update(Observable bank, Object rekening) {
        if (rekening instanceof Rekening){
            Count +=1;
            System.out.println("Het nieuwe rekeningsnummer is: "+((Rekening) rekening).getRekeningnummer() +" nu heeft de bank"+ Count+" aantal rekeningen");
        }
    }
}

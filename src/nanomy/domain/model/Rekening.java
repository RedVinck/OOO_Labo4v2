package nanomy.domain.model;

import java.util.Date;

public class Rekening {
    private int rekeningnummer;
    private double balans;
    private Date startdate;

    public Rekening(int rekeningnummer, double balans) {
        setRekeningnummer(rekeningnummer);
        setBalans(balans);
        setStartdate( new Date(System.currentTimeMillis()));
    }


    public int getRekeningnummer() {
        return rekeningnummer;
    }

    private void setRekeningnummer(int rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public double getBalans() {
        return balans;
    }

    private void setBalans(double balans) {
        this.balans = balans;
    }

    public Date getStartdate() {
        return startdate;
    }

    private void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
}

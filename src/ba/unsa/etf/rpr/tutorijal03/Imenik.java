package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    private HashMap<String, TelefonskiBroj> hashPoImenu = new HashMap<>();
    private HashMap<TelefonskiBroj, String> hashPoTelefonskomBroju = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj){
        hashPoImenu.put(ime, broj);
        hashPoTelefonskomBroju.put(broj, ime);
    }
    public String dajBroj(String ime){
        if(hashPoImenu.containsKey(ime))
            return hashPoImenu.get(ime).ispisi();
        return null;
    }
    public String dajIme(TelefonskiBroj broj){
        if(hashPoTelefonskomBroju.containsKey(broj))
            return hashPoTelefonskomBroju.get(broj);
        return null;
    }
}

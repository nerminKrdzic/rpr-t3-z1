package ba.unsa.etf.rpr.tutorijal03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Imenik {
    private Map<String, TelefonskiBroj> hashPoImenu = new HashMap<>();
    private Map<TelefonskiBroj, String> hashPoTelefonskomBroju = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj){
        hashPoImenu.put(ime, broj);
        hashPoTelefonskomBroju.put(broj, ime);
    }
    public String dajBroj(String ime) {
        if(hashPoImenu.containsKey(ime))
            return hashPoImenu.get(ime).ispisi();
        return null;
    }
    public String dajIme(TelefonskiBroj broj){
        if(hashPoTelefonskomBroju.containsKey(broj))
            return hashPoTelefonskomBroju.get(broj);
        return null;
    }
    public String naSlovo(char s){
        String slovo = Character.toString(s);
        String result = "";
        int i = 1;
        Iterator<Map.Entry<String, TelefonskiBroj>> it = hashPoImenu.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, TelefonskiBroj> pair = (Map.Entry<String, TelefonskiBroj>) it.next();
            if(pair.getKey().substring(0,1).equalsIgnoreCase(slovo)){
                result += Integer.toBinaryString(i) + ". " + pair.getKey() + " - " + pair.getValue().ispisi() + "\n";
                i++;
            }
        }
        return result;
    }
}

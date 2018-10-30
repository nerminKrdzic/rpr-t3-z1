package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj implements Comparable {
    private String drzava = null;
    private String broj = null;

    public MedunarodniBroj(String drzava, String broj){
        setDrzava(drzava);
        setBroj(broj);
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        TelefonskiBroj o2 = (MedunarodniBroj) o;
        return ispisi().compareTo(o2.ispisi());
    }

}

package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza = 0;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj){
        setMobilnaMreza(mobilnaMreza);
        setBroj(broj);
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    @Override
    public String ispisi() {
        return "0" + Integer.toString(mobilnaMreza) + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

public class Zamestnanec {
    String meno;
    int vek;
    int plat;
    public Zamestnanec(String meno, int vek, int plat)
    {
        this.meno = meno;
        this.vek = vek;
        this.plat = plat;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }


}

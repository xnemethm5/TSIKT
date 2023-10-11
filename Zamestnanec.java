public class Zamestnanec {
    String meno;
    int vek;
    int id;
    public Zamestnanec(String meno, int vek, int id)
    {
        this.meno = meno;
        this.vek = vek;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

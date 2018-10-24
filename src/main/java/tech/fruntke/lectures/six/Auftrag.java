package tech.fruntke.lectures.six;

public class Auftrag {
    private Artikel artikel;
    private int menge;

    public Auftrag(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public static double getGesamtwert(Auftrag... auftraege) {
        int sum = 0;
        for (Auftrag auftrag : auftraege) {
            sum += (auftrag.getMenge() * auftrag.getArtikel().getPreis());
        }
        return sum;
    }

    private Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    private int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }
}

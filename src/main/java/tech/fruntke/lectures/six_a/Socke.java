package tech.fruntke.lectures.six_a;

public class Socke {
    private String farbe;
    private boolean istTrocken;

    public Socke() {
        this("schwarz");
        this.istTrocken = false;
    }

    private Socke(String farbe) {
        this.farbe = farbe;
    }

    public boolean istTrocken() {
        return this.istTrocken;
    }

    public void trockne() {
        this.istTrocken = true;
    }

    public void wasche() {
        this.istTrocken = false;
    }

    @Override
    public String toString() {
        return "Socke mit Farbe: " + this.farbe + " ist trocken " + (istTrocken ? "ja" : "nein");
    }
}

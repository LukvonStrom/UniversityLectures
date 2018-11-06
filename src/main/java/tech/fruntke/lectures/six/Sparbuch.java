package tech.fruntke.lectures.six;

public class Sparbuch {
    private int kontonummer;
    private double kapital;
    private double zinssatz;

    public void zahleEin(double kapital) {
        this.kapital += kapital;
    }

    public void hebeAb(double kapital) {
        this.kapital -= kapital;
    }

    public void verzinse() {
        this.kapital *= this.zinssatz;
    }

    public int getKontonummer() {
        return this.kontonummer;
    }

    public double getKapital() {
        return this.kapital;
    }

    public double getZinssatz() {
        return this.zinssatz;
    }
}

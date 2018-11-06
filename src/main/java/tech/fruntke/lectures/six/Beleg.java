package tech.fruntke.lectures.six;

public class Beleg {
    private int nummer = 10000;

    Beleg() {
        nummer++;
    }

    public int getNummer() {
        return this.nummer;
    }
}

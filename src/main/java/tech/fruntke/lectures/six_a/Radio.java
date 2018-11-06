package tech.fruntke.lectures.six_a;

import java.util.ArrayList;
import java.util.List;

public class Radio {
    private boolean eingeschaltet;
    // Lautstärke kann als absoluter Wert in db gesetzt sein (=> Datentyp = Integer)
    // oder wie hier relativ als Prozentzahl zur Maximallautstärke
    private double lautstaerke;
    private double frequenz;
    private List<Double> frequencyStorage = new ArrayList<>();

    public Radio() {
    }

    public Radio(boolean eingeschaltet, double lautstaerke) {
        this.eingeschaltet = eingeschaltet;
        this.lautstaerke = lautstaerke;
    }

    public Radio(boolean eingeschaltet, double lautstaerke, double frequenz) {
        this.eingeschaltet = eingeschaltet;
        this.lautstaerke = lautstaerke;
        this.frequenz = frequenz;
        this.frequencyStorage.add(frequenz);
    }


    public void lauter() {
        this.lautstaerke++;
    }

    public void lauter(int i) {
        this.lautstaerke += i;
    }

    public void leiser() {
        this.lautstaerke--;
    }

    public void leiser(int i) {
        this.lautstaerke -= i;
    }

    public void an() {
        this.eingeschaltet = true;
    }

    public void aus() {
        this.eingeschaltet = false;
    }

    public boolean istAn() {
        return this.eingeschaltet;
    }

    public double erhalteLautstaerke() {
        return this.lautstaerke;
    }

    public void waehleSender(double frequenz) {
        this.frequenz = frequenz;
        this.frequencyStorage.add(frequenz);
    }

    @Override
    public String toString() {
        return "Radio mit Frequenz: " + this.frequenz + "ist An: " + this.eingeschaltet + " und Lautstärke: " + this.lautstaerke + " und Frequenzspeicher: " + frequencyStorage.toString();
    }
}

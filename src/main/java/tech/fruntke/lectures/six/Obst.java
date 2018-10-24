package tech.fruntke.lectures.six;

public abstract class Obst {
    public abstract String getName();

    public abstract String getFarbe();

    void print() {
        System.out.println("Name: " + getName() + " Farbe: " + getFarbe());
    }
}

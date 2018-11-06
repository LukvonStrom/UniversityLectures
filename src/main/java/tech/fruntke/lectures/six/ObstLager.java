package tech.fruntke.lectures.six;

@SuppressWarnings({"WeakerAccess", "ForLoopReplaceableByForEach"})
public class ObstLager {

    private Obst[] lager = {new Birne(), new Orange(), new Apfel()};

    public static void main(String[] args) {
        ObstLager obstLager = new ObstLager();
        obstLager.print();
    }

    public void print() {
        for (int i = 0; i < lager.length; i++) {
            System.out.println("Name: " + lager[i].getName() + " Farbe: " + lager[i].getFarbe());
        }

        /*
        // alternative Syntax:
        for (Obst lagerItem : lager) {
            System.out.println("Name: " + lagerItem.getName() + " Farbe: " + lagerItem.getFarbe());
        }
        */
    }
}

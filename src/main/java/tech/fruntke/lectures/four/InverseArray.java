package tech.fruntke.lectures.four;

@SuppressWarnings("ForLoopReplaceableByForEach")
public class InverseArray {
    public static void main(String[] args) {
        int[] randomArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int n = randomArray.length;
        // wir iterieren nur durch die erste Hälfte, da unser Algorithmus beitseitig tauscht.
        // würden wir i < n einsetzen, wären die Zahlen wieder in der richtigen Reihenfolge
        for (int i = 0; i < n / 2; i++) {
            int tempElement = randomArray[i];
            // n-1, da der erste Index des Arrays ja 0 ist.
            // -i um die "gleiche Position" von i zu erreichen
            // jetzt haben z.B. randomArray[2] und randomArray[7] den gleichen Wert, nämlich 8
            // hätten wir uns nicht vorher den Wert von randomArray[i] in die Variable tempElement gelegt, wäre dieser jetzt überschrieben
            randomArray[i] = randomArray[n - 1 - i];

            randomArray[n - 1 - i] = tempElement;
        }

        /*
        erwartete Ausgabe:
        0
        9
        8
        7
        6
        5
        4
        3
        2
        1

         */
        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }

        // alternative Schreibweise
        /*
        for (int randomArrayElement : randomArray) {
            System.out.println(randomArrayElment);
        }
        */
    }
}

package tech.fruntke.lectures.four;

@SuppressWarnings("ForLoopReplaceableByForEach")
public class ArraySum {
    public static void main(String[] args) {
        int[] randomArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int arraySum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            arraySum = arraySum + randomArray[i];
        }
        /*
        // alternative Schreibweise:
        for (int arrayElement : randomArray) {
            arraySum += arrayElement;
        }
        */

        // erwartete Ausgabe: "Summe: 45"
        System.out.println("Summe: " + arraySum);
    }
}

package tech.fruntke.lectures.four;

@SuppressWarnings("ForLoopReplaceableByForEach")
public class ArrayMinimum {
    public static void main(String[] args) {
        int[] randomArray = {2, 3, 4, 5, 6, 7, 8, 1, 9};
        int tempArrayMinimum = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (tempArrayMinimum > randomArray[i]) {
                tempArrayMinimum = randomArray[i];
            }
        }

        /*
        // alternative Schreibweise:
        for (int aRandomArrayElement : randomArray) {
            tempArrayMinimum = Math.min(tempArrayMinimum, aRandomArrayElement);
        }
        */
        // erwartete Ausgabe: "Minimum: 1"
        System.out.println("Minimum: " + tempArrayMinimum);
    }
}

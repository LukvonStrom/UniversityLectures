package tech.fruntke.lectures.two;

public class DecimalIntegerConversion {
    public static void main(String[] args) {
        int randomNumber = 5;
        // randomNumber wird vom Typ int, mit dem wir sie initialisiert haben zum Typen
        // double gecastet
        double decimalNumber = (double) randomNumber;

        // erwartete Ausgabe: "5 & 5.0"
        System.out.println(randomNumber + " & " + decimalNumber);

        // casten geht auch ohne eine Variable, die den Wert speichert
        // statdessen können wir es direkt im Methodenaufruf von System.out.println() ausführen
        // jetzt casten wir randomNumber, welche als Integer initialisiert wurde zum Datentyp Double,
        // während wir decimalNumber, welche als Double initialisiert wurde zum Datentyp Integer gecastet wird.

        // erwartete Ausgabe: "5.0 & 5"
        System.out.println((double) randomNumber + " & " + (int) decimalNumber);
    }
}

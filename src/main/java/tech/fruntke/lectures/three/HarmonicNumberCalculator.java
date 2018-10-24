package tech.fruntke.lectures.three;

import java.util.Scanner;

public class HarmonicNumberCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte als nächstes n eingeben:");
        int runs = scanner.nextInt();

        // Die Variable, in die das Produkt geschrieben wird
        // Wegen Multiplikation mit 0 muss das Produkt zwingend am Anfang den Wert 1 haben.
        double harmonicNumber = 1;

        // erwartete Ausgabe bei Eingabe von "2": "1 + 1/2 = 2.5"
        for (int i = 1; i <= runs; i++) {
            harmonicNumber = harmonicNumber + 1.0 / i;

            // alternative Schreibweise:
            // harmonicNumber += 1.0/i;

            if (i < runs) {
                System.out.print(i + " + 1/");
            } else {
                System.out.print(i);
            }

        }
        System.out.print(" = " + harmonicNumber);
    }
}

package tech.fruntke.lectures.three;

import java.util.Scanner;

public class FacultyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte als nächstes n eingeben:");
        int n = scanner.nextInt();

        // Die Variable, in die das Produkt geschrieben wird
        // Wegen Multiplikation mit 0 muss das Produkt zwingend am Anfang den Wert 1 haben.
        int product = 1;

        // erwartete Ausgabe bei Eingabe von "5": "1*2*3*4*5 = 120"
        for (int i = 1; i <= n; i++) {
            product = product * i;

            // alternative Schreibweise:
            // product *= i;

            if (i < n) {
                System.out.print(i + "*");
            } else {
                System.out.print(i);
            }

        }
        System.out.print(" = " + product);
    }
}

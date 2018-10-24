package tech.fruntke.lectures.three;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte als nächstes n eingeben:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int temp = j * i;
                // wenn unsere Zahl nicht zweistellig ist, zerstört das die Formatierung unserer Tabelle
                if (temp < 10) {
                    // Deshalb geben wir bei Zahlen kleiner 10 nach der schließenden eckigen Klammer ein Leerzeichen aus.
                    System.out.print("[" + temp + "] ");
                } else {
                    // bei Zahlen größer 10 brauchen wir das nicht, die geben wir ohne Leerzeichen aus
                    System.out.print("[" + temp + "]");
                }

                // alternative Schreibweise mit dem sogenannten ternären Operator
                // System.out.print("[" + temp + (temp<10 ? "] " : "]"));

            }
            // hier gebe ich einen Zeilenumbruch aus. Gleicher
            // Effekt wie System.out.println() aufzurufen
            System.out.print("\n");
        }
    }
}

package tech.fruntke.lectures.three;

import java.util.Scanner;

public class IntegerAggregation {
    public static void main(String[] args) {
        // Variable für die Anzahl der Durchläufe, wird durch die Eingabe in der Kommandozeile gesetzt.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte als nächstes n eingeben:");
        int runs = scanner.nextInt();
        // Die Variable, in die die Summe geschrieben wird
        int sum = 0;

        //Die Schleife durchläuft in diesem Beispiel den Ausführungsblock 5 mal, die Durchlaufvariable beginnt bei 1 und endet
        // bei 5 (beachte i = 1 und i <= runs)

        // erwartete Ausgabe bei Eingabe von "5": "1+2+3+4+5 = 15"
        for (int i = 1; i <= runs; i++) {
            sum = sum + i;

            // alternative Schreibweise:
            // sum += i;

            // Solange wir nicht am letzten Durchlauf angekommen sind, also die Durchlaufvariable i kleiner als die Anzahl an
            // Durchläufen ist, möchte ich zusätzlich ein "+" ausgeben, damit die Ausgabe nach einer Rechnung aussieht
            if (i < runs) {
                System.out.print(i + "+");
            } else {
                // hinter dem letzten Durchlauf ein "+" auszugeben macht wenig sind, deshalb wird nur i ausgegeben
                System.out.print(i);
            }

        }
        System.out.print(" = " + sum);

    }
}

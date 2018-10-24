package tech.fruntke.lectures.three;

import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperatur (in Grad Celsius)");
        double t = scanner.nextDouble();
        System.out.println("Windgeschwindigkeit (in km/h)");
        double v = scanner.nextDouble();

        // Math.pow nimmt als ersten Wert die Basis im Datentyp double und als zweiten Werten den Exponenten im Datentyp double
        double w = 13.12 + (0.6215 * t) + ((0.3965 * t) - 11.37) * Math.pow(v, 0.16);

        System.out.println("w = " + w + " Grad Celsius");
    }
}

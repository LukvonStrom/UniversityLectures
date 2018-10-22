package tech.fruntke.lectures.two;

public class InterestCalculator {
    public static void main(String[] args) {
        double baseBalance = 500.0;
        for (int i = 0; i < 2; i++) {
            baseBalance = baseBalance * 1.09;
            // funktionell gleich:
            // baseBalance *= 1.09;
        }
        // erwartete Ausgabe: "Given 500€ at the end of year 2 with 9% interest rate gives 594.0500000000001"

        System.out.println("Given 500€ at the end of year 2 with 9% interest rate gives " + baseBalance);
    }
}

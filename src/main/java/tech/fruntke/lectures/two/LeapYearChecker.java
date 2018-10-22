package tech.fruntke.lectures.two;

@SuppressWarnings("ConstantConditions")
public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2004;
        // Wenn wir das Jahr durch 4 teilen und das Ergebnis eine Dezimalzahl ist, also einen Rest hat (Modulo ungleich 0) ists kein Schaltjahr
        // erwartetes Ergebnis: "Schaltjahr!"
        if (year % 4 != 0) {
            System.out.println("kein Schaltjahr!");
        } else if (year % 400 == 0) {
            System.out.println("Schaltjahr!");
        } else if (year % 100 == 0) {
            System.out.println("kein Schaltjahr!");
        } else {
            System.out.println("Schaltjahr!");
        }
    }
}

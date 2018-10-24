package tech.fruntke.lectures.three;

import java.util.Scanner;

@SuppressWarnings("ConstantConditions")
public class MultiplesInLongRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte als nächstes n eingeben:");
        int base = scanner.nextInt();
        long sum = 0;
        for (long i = 1; sum <= Long.MAX_VALUE; i++) {
            sum = base * i;
            System.out.println(base + " * " + i + " = " + sum);
        }
    }
}

package tech.fruntke.lectures.two;

public class TrailingBitFlip {
    public static void main(String[] args) {
        // größtmöglicher Wert: 127
        // für Details was hier abgeht, das Skript aus Grundlagen der IT vom 22.10. beachten

        // alternative Syntax:
        // byte testByte = Byte.MAX_VALUE;
        byte testByte = 127;
        testByte++;
        // erwartete Ausgabe: "-128"
        System.out.print(testByte);
    }
}

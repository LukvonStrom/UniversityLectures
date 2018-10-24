package tech.fruntke.lectures.three;

@SuppressWarnings("StringConcatenationInLoop")
public class LoopingLineBreak {
    public static void main(String[] args) {
        String buff = "";
        for (int i = 1000; i <= 2000; i++) {
            buff = buff + (" " + i);
            // buff += " "+i
            if (i % 5 == 4 || i == 2000) {
                System.out.println(buff);
                buff = "";
            }
        }
    }
}

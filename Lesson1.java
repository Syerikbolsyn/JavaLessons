import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        byte a = 1;
        a += 1;
        char b = 'a';
        b *= 12.31;
        String[] words = new String[9];
        for (int i = 0; i < 10; i++) {
            words[i] = "dsrw";
        }
        String[] copy = words.clone();
        // int k = java.math.BigInteger(c + b);
        System.out.println(Arrays.equals(words, copy));
    }
}

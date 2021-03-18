package learn_tokenizer;

import java.util.StringTokenizer;

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
            System.out.println();
        }
    }
}

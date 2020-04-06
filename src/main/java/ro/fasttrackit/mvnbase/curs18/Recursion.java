package ro.fasttrackit.mvnbase.curs18;

import static java.lang.Character.isUpperCase;

public class Recursion {
    public int wordLength(String word) {
        if (word == null) throw new IllegalArgumentException("word cannot be null");
        if (word.isEmpty()) {
            return 0;
        } else {
            return 1 + wordLength(word.substring(1));
        }
    }

    public char firstUppercase(String word) {
        return word.charAt(0);
    }
}

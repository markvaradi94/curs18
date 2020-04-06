package ro.fasttrackit.mvnbase.curs18;

public class Recursion {
    public int wordLength(String word) {
        if (word == null) throw new IllegalArgumentException("word cannot be null");
        if (word.isEmpty()) {
            return 0;
        } else {
            return 1 + wordLength(word.substring(1));
        }
    }

    public int stringLength(String str) {
        if (str == null) throw new IllegalArgumentException("word cannot be null");
        if (str.isEmpty()) {
            return 0;
        } else {
            return 1 + stringLength(str.substring(1));
        }
    }
}

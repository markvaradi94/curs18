package ro.fasttrackit.mvnbase.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.*;


class RecursionTest {
    Recursion recursion;

    @BeforeEach
    void setup() {
        recursion = new Recursion();
    }

    @Test
    @DisplayName("WHEN null is received THEN throw exception")
    void nullInput() {
        assertThrows(IllegalArgumentException.class, () -> recursion.stringLength(null));
    }

    @Test
    @DisplayName("WHEN empty string is received THEN 0 is returned")
    void emptyString() {
        assertThat(recursion.stringLength("")).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN 1 letter is received THEN 1 is returned")
    void oneLetter() {
        assertThat(recursion.stringLength("a")).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN apple is received THEN 5 is returned")
    void appleStringLength() {
        assertThat(recursion.stringLength("apple")).isEqualTo(5);
    }

    @Test
    @DisplayName("WHEN null is received THEN throw exception")
    void nullLength() {
        assertThrows(IllegalArgumentException.class, () -> recursion.wordLength(null));
    }

    @Test
    @DisplayName("WHEN empty string is received THEN 0 is returned")
    void zeroLength() {
        assertThat(recursion.wordLength("")).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN apple is received THEN 5 is returned")
    void appleLength() {
        assertThat(recursion.wordLength("apple")).isEqualTo(5);
    }

    @Test
    @DisplayName("WHEN Neurofibromatosis is received THEN 17 is returned")
    void longWord() {
        assertThat(recursion.wordLength("Neurofibromatosis")).isEqualTo(17);
    }

}
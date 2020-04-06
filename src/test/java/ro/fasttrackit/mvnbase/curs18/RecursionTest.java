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
    @DisplayName("WHEN empty string is received THEN 0 is returned")
    void emptyString() {
        assertThat(recursion.wordLength("")).isEqualTo(0);
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

    @Test
    @DisplayName("WHEN null is being searched THEN throw exception")
    void nullSearch() {
        assertThrows(IllegalArgumentException.class, () -> recursion.firstUppercase(null));
    }

    @Test
    @DisplayName("WHEN empty string is being searched THEN throw exception")
    void emptySearch() {
        assertThrows(IllegalArgumentException.class, () -> recursion.firstUppercase(""));
    }

}
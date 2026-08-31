package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationTest {

    private final Concatenation ex = new Concatenation();

    @Test
    @DisplayName("joinDigits(1, 2) is \"12\" — the empty string makes + join")
    void joinsOneAndTwo() {
        assertEquals("12", ex.joinDigits(1, 2));
    }

    @Test
    @DisplayName("joinDigits(40, 5) is \"405\"")
    void joinsFortyAndFive() {
        assertEquals("405", ex.joinDigits(40, 5));
    }

    @Test
    @DisplayName("sumAsText(1, 2) is \"3\" — same numbers, + adds first")
    void addsOneAndTwo() {
        assertEquals("3", ex.sumAsText(1, 2));
    }

    @Test
    @DisplayName("sumAsText(40, 5) is \"45\"")
    void addsFortyAndFive() {
        assertEquals("45", ex.sumAsText(40, 5));
    }
}

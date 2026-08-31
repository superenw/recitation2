package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerDivisionTest {

    private final IntegerDivision ex = new IntegerDivision();

    @Test
    @DisplayName("half(10) is 5 — no fraction to lose")
    void halfOfTen() {
        assertEquals(5, ex.half(10));
    }

    @Test
    @DisplayName("half(5) is 2, not 2.5 — Python's answer is wrong here")
    void halfOfFive() {
        assertEquals(2, ex.half(5));
    }

    @Test
    @DisplayName("half(-7) is -3, not -4 — Java truncates toward zero, Python floors")
    void halfOfNegativeSeven() {
        assertEquals(-3, ex.half(-7));
    }

    @Test
    @DisplayName("exactHalf(5) is 2.5 — one side must be a double")
    void exactHalfOfFive() {
        assertEquals(2.5, ex.exactHalf(5), 1e-9);
    }

    @Test
    @DisplayName("exactHalf(10) is 5.0")
    void exactHalfOfTen() {
        assertEquals(5.0, ex.exactHalf(10), 1e-9);
    }

    @Test
    @DisplayName("average(7, 10) is 8 — the true 8.5 is truncated")
    void averageTruncates() {
        assertEquals(8, ex.average(7, 10));
    }

    @Test
    @DisplayName("average(4, 10) is 7 — exact, nothing lost")
    void averageExact() {
        assertEquals(7, ex.average(4, 10));
    }
}

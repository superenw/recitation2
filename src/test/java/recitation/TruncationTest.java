package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruncationTest {

    private final Truncation ex = new Truncation();

    @Test
    @DisplayName("chop(3.9) is 3 — casting does not round")
    void chopsThreeNine() {
        assertEquals(3, ex.chop(3.9));
    }

    @Test
    @DisplayName("chop(-3.9) is -3 — toward zero, not away from it")
    void chopsNegative() {
        assertEquals(-3, ex.chop(-3.9));
    }

    @Test
    @DisplayName("roundOff(3.9) is 4 — this one does round")
    void roundsUp() {
        assertEquals(4, ex.roundOff(3.9));
    }

    @Test
    @DisplayName("roundOff(3.1) is 3")
    void roundsDown() {
        assertEquals(3, ex.roundOff(3.1));
    }

    @Test
    @DisplayName("toHundredths(1.4815297) is 1.48 — the Skill Builder 1 trick")
    void twoPlacesOfSpice() {
        assertEquals(1.48, ex.toHundredths(1.4815297665908702), 1e-9);
    }

    @Test
    @DisplayName("toHundredths(3.999) is 3.99, not 4.0 — chopped, not rounded")
    void twoPlacesChopsRatherThanRounds() {
        assertEquals(3.99, ex.toHundredths(3.999), 1e-9);
    }

    @Test
    @DisplayName("toHundredths(5.0) is 5.0 — dividing by 100.0, not 100")
    void twoPlacesKeepsTheDecimalType() {
        assertEquals(5.0, ex.toHundredths(5.0), 1e-9);
    }
}

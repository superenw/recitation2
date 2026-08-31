package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharArithmeticTest {

    private final CharArithmetic ex = new CharArithmetic();

    @Test
    @DisplayName("letterCode('A') is 65")
    void codeOfCapitalA() {
        assertEquals(65, ex.letterCode('A'));
    }

    @Test
    @DisplayName("letterCode('a') is 97 — capitals and lowercase are different numbers")
    void codeOfLowercaseA() {
        assertEquals(97, ex.letterCode('a'));
    }

    @Test
    @DisplayName("nextLetter('A') is 'B' — needs an explicit (char) cast")
    void nextAfterCapitalA() {
        assertEquals('B', ex.nextLetter('A'));
    }

    @Test
    @DisplayName("nextLetter('y') is 'z'")
    void nextAfterLowercaseY() {
        assertEquals('z', ex.nextLetter('y'));
    }
}

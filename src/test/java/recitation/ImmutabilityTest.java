package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmutabilityTest {

    private final Immutability ex = new Immutability();

    @Test
    @DisplayName("shout(\"hello\") is \"HELLO\" — you must return the result")
    void shoutsHello() {
        assertEquals("HELLO", ex.shout("hello"));
    }

    @Test
    @DisplayName("shout does not change the string it was given")
    void shoutLeavesTheOriginalAlone() {
        String original = "hello";
        ex.shout(original);
        assertEquals("hello", original);
    }

    @Test
    @DisplayName("trimmed(\"  hi  \") is \"hi\"")
    void trimsBothEnds() {
        assertEquals("hi", ex.trimmed("  hi  "));
    }

    @Test
    @DisplayName("trimmed leaves an already-clean string alone")
    void trimsNothingWhenThereIsNothingToTrim() {
        assertEquals("hi", ex.trimmed("hi"));
    }
}

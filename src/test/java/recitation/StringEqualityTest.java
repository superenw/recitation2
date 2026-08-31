package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEqualityTest {

    private final StringEquality ex = new StringEquality();

    @Test
    @DisplayName("sameText: identical literals are the same text")
    void literalsHaveSameText() {
        assertTrue(ex.sameText("hi", "hi"));
    }

    @Test
    @DisplayName("sameText: a new String holds the same text — use .equals()")
    void newStringHasSameText() {
        assertTrue(ex.sameText("hi", new String("hi")));
    }

    @Test
    @DisplayName("sameText: different text is not the same text")
    void differentTextIsNotEqual() {
        assertFalse(ex.sameText("hi", "bye"));
    }

    @Test
    @DisplayName("sameObject: a new String is a different object — == is false")
    void newStringIsADifferentObject() {
        assertFalse(ex.sameObject("hi", new String("hi")));
    }

    @Test
    @DisplayName("sameObject: a reference compared with itself is the same object")
    void sameReferenceIsTheSameObject() {
        String s = new String("hi");
        assertTrue(ex.sameObject(s, s));
    }
}

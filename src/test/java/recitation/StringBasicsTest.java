package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBasicsTest {

    private final StringBasics ex = new StringBasics();

    @Test
    @DisplayName("initials(\"Jean\", \"Claude\") is \"JC\" — not the sum of two char codes")
    void initialsOfJeanClaude() {
        assertEquals("JC", ex.initials("Jean", "Claude"));
    }

    @Test
    @DisplayName("initials(\"Ada\", \"Lovelace\") is \"AL\"")
    void initialsOfAdaLovelace() {
        assertEquals("AL", ex.initials("Ada", "Lovelace"));
    }

    @Test
    @DisplayName("lastCharacter(\"hello\") is 'o' — length() - 1, no negative indexing")
    void lastCharacterOfHello() {
        assertEquals('o', ex.lastCharacter("hello"));
    }

    @Test
    @DisplayName("lastCharacter(\"a\") is 'a'")
    void lastCharacterOfOneLetter() {
        assertEquals('a', ex.lastCharacter("a"));
    }

    @Test
    @DisplayName("firstThree(\"hello\") is \"hel\" — substring stops BEFORE the end index")
    void firstThreeOfHello() {
        assertEquals("hel", ex.firstThree("hello"));
    }

    @Test
    @DisplayName("firstThree(\"abc\") is \"abc\"")
    void firstThreeOfExactlyThree() {
        assertEquals("abc", ex.firstThree("abc"));
    }
}

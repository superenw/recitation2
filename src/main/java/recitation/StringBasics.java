package recitation;

/**
 * Exercise 8 — Reaching into a String.
 *
 * Everything here you already do in Python. The names are different and the
 * brackets are gone:
 *
 *     Python              Java
 *     len(s)              s.length()
 *     s[0]                s.charAt(0)
 *     s[0:3]              s.substring(0, 3)
 *     s[-1]               s.charAt(s.length() - 1)
 *
 * Java has no negative indexing. The last character is always length() - 1,
 * and you will write that expression for the rest of the semester.
 */
public class StringBasics {

    /**
     * The first letter of each name, joined.
     *
     * initials("Jean", "Claude") is "JC".
     *
     * charAt returns a char, and joining two chars with + adds their numeric
     * codes — exercise 3 again. Start with "" to force joining.
     *
     * @param first the first name
     * @param last  the last name
     * @return the two initial letters
     */
    public String initials(String first, String last) {
        return null;
    }

    /**
     * The last character of the string.
     *
     * lastCharacter("hello") is 'o'.
     *
     * @param s a string with at least one character
     * @return its final character
     */
    public char lastCharacter(String s) {
        return ' ';
    }

    /**
     * The first three characters.
     *
     * firstThree("hello") is "hel".
     *
     * substring takes the index to start at and the index to stop BEFORE —
     * the same half-open range as a Python slice.
     *
     * @param s a string with at least three characters
     * @return its first three characters
     */
    public String firstThree(String s) {
        return null;
    }
}

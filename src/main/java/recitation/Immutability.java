package recitation;

/**
 * Exercise 5 — Strings never change.
 *
 * A Java String cannot be modified. Every String method that looks like it
 * edits the string actually builds a NEW string and hands it back. If you
 * throw away the return value, nothing happens:
 *
 *     String s = "hello";
 *     s.toUpperCase();       // computes "HELLO" and discards it
 *     System.out.println(s); // still prints hello
 *
 * The fix is always the same: use what the method returns.
 */
public class Immutability {

    /**
     * The text in upper case. The string you were handed is not changed.
     *
     * shout("hello") is "HELLO".
     *
     * @param s any string
     * @return the same text in upper case
     */
    public String shout(String s) {
        return s.toUpperCase();
    }

    /**
     * The text with leading and trailing spaces removed.
     *
     * trimmed("  hi  ") is "hi".
     *
     * @param s any string
     * @return the text without surrounding whitespace
     */
    public String trimmed(String s) {
        return s.trim();
    }
}
package recitation;

/**
 * Exercise 3 — A char is a number.
 *
 * Python has no char type; a single character is just a one-letter string.
 * In Java a char holds a number — 'A' is 65 — and doing arithmetic on it
 * gives you back an int, not a char.
 *
 * Getting a char back out requires saying so explicitly, with a cast.
 */
public class CharArithmetic {

    /**
     * The numeric code of a character.
     * <p>
     * letterCode('A') is 65.  letterCode('a') is 97.
     * <p>
     * Java will widen a char to an int on its own — no cast needed here.
     *
     * @param c any character
     * @return its numeric value
     */
    public int letterCode(char c) {
        return c;
    }

    /**
     * The next letter of the alphabet.
     * <p>
     * nextLetter('A') is 'B'.  nextLetter('y') is 'z'.
     * <p>
     * c + 1 gives you an int. Java will NOT narrow that back to a char for
     * you — you have to cast it: (char)(...)
     *
     * @param c any character
     * @return the character one code point after it
     */
    public char nextLetter(char c) {
        return (char)(c + 1);
    }
}

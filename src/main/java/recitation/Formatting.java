package recitation;

/**
 * Exercise 7 — Formatting numbers for people to read.
 *
 * Python has f-strings. Java has printf and String.format, which take the
 * same format string. %.2f means "a decimal number, two places".
 *
 * Unlike casting, formatting ROUNDS. Exercise 6 chopped; this one rounds.
 * Knowing which one you are doing is most of Skill Builder 1.
 *
 * String.format builds the text and returns it.
 * System.out.printf prints it. Same format string, different destination.
 */
public class Formatting {

    /**
     * The value written with exactly two decimal places.
     *
     * twoPlaces(0.5142857) is "0.51".
     * twoPlaces(3.999) is "4.00" — this ROUNDS, where chop() did not.
     *
     * @param value any decimal number
     * @return the value as text, to two decimal places
     */
    public String twoPlaces(double value) {
        return null;
    }

    /**
     * The value written with exactly four decimal places.
     *
     * fourPlaces(1.4815297665908702) is "1.4815".
     *
     * @param value any decimal number
     * @return the value as text, to four decimal places
     */
    public String fourPlaces(double value) {
        return null;
    }

    /**
     * The sentence Skill Builder 1 has to print, built as a string.
     *
     * spiceReport("Jean Claude", 1.4815297665908702) is
     *     "Well Jean Claude, the spice value resulted in 1.4815"
     *
     * One String.format call. No printf, and no println.
     *
     * @param name  the user's name
     * @param spice the computed spice value
     * @return the full sentence, with spice to four decimal places
     */
    public String spiceReport(String name, double spice) {
        return null;
    }
}

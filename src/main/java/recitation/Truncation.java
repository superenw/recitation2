package recitation;

/**
 * Exercise 6 — Casting chops, it does not round.
 *
 * Java will happily widen a small type into a bigger one on its own, but it
 * will never narrow one for you — int x = 3.5; does not compile. You have to
 * say (int) and take responsibility for what gets lost.
 *
 * And what gets lost is everything after the decimal point. (int) 3.9 is 3.
 *
 * The last method here is the exact trick Skill Builder 1 asks you to use.
 */
public class Truncation {

    /**
     * The whole-number part, with the fraction thrown away.
     *
     * chop(3.9) is 3.  chop(3.1) is 3.  chop(-3.9) is -3.
     *
     * @param value any decimal number
     * @return the value with everything after the decimal point removed
     */
    public int chop(double value) {
        return 0;
    }

    /**
     * The nearest whole number.
     *
     * roundOff(3.9) is 4.  roundOff(3.1) is 3.
     *
     * Math.round hands back a long, which is a bigger type than int, so you
     * still need a cast to get an int out.
     *
     * @param value any decimal number
     * @return the value rounded to the nearest whole number
     */
    public int roundOff(double value) {
        return 0;
    }

    /**
     * The value cut off — not rounded — at two decimal places.
     *
     * toHundredths(1.4815297) is 1.48.
     * toHundredths(3.999) is 3.99, NOT 4.0.
     *
     * The trick, and you will use it again in Skill Builder 1: multiply by
     * 100, cast to int so the rest is chopped off, then divide by 100.0.
     *
     * Watch that last divide. If you write / 100 instead of / 100.0 you are
     * back in exercise 1 and the answer comes out whole.
     *
     * @param value any decimal number
     * @return the value truncated to two decimal places
     */
    public double toHundredths(double value) {
        return 0.0;
    }
}

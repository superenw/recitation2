package recitation;

/**
 * Exercise 1 — Integer division.
 *
 * In Python, 5 / 2 is 2.5. In Java it is 2.
 *
 * The rule: if BOTH sides of / are int, Java does integer division and throws
 * away the fractional part. If either side is a double, you get a double.
 */
public class IntegerDivision {

    /**
     * Half of n, using integer division — the fraction is discarded.
     *
     * half(10) is 5.  half(5) is 2, not 2.5.  half(-7) is -3, not -4.
     *
     * @param n any whole number
     * @return n divided by 2, truncated toward zero
     */
    public int half(int n) {
        return n / 2;
    }

    /**
     * Half of n as an exact decimal.
     *
     * exactHalf(5) is 2.5.
     *
     * You cannot just write n / 2 here — both sides are int, so Java would
     * do the division the wrong way and only then widen the answer.
     *
     * @param n any whole number
     * @return n divided by 2, keeping the fraction
     */
    public double exactHalf(int n) {
        return n / 2.0;
    }

    /**
     * The average of two whole numbers, as a whole number.
     *
     * average(7, 10) is 8 — the true average is 8.5 and the .5 is discarded.
     *
     * @param a first number
     * @param b second number
     * @return their average, truncated toward zero
     */
    public int average(int a, int b) {
        return (a + b) / 2;
    }
}

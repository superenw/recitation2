package recitation;

/**
 * Exercise 2 — When + means "add" and when it means "join".
 *
 * Java reads + from left to right. As soon as one side is a String, every +
 * after it joins text instead of adding numbers. Move the "" and the answer
 * changes.
 *
 * These two methods take the same two numbers and give different answers.
 * That is the point of the exercise.
 */
public class Concatenation {

    /**
     * The two numbers written side by side as text.
     *
     * joinDigits(1, 2) is "12".  joinDigits(40, 5) is "405".
     *
     * Hint: start the expression with "" so the first + is already joining.
     *
     * @param a first number
     * @param b second number
     * @return a and b written one after the other
     */
    public String joinDigits(int a, int b) {
        return null;
    }

    /**
     * The sum of the two numbers, as text.
     *
     * sumAsText(1, 2) is "3".  sumAsText(40, 5) is "45".
     *
     * Hint: put the "" at the END, so both numbers are added first.
     *
     * @param a first number
     * @param b second number
     * @return a + b, written as text
     */
    public String sumAsText(int a, int b) {
        return null;
    }
}

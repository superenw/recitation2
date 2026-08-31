package recitation;

/**
 * Exercise 4 — == does not mean what it means in Python.
 *
 * This is the single most important trap in this exercise set.
 *
 * In Python, == compares the text. In Java, == on two Strings compares
 * whether they are the SAME OBJECT in memory. Two different objects holding
 * identical text are not ==.
 *
 * To compare the text, call .equals().
 */
public class StringEquality {

    /**
     * True when the two strings contain the same characters, regardless of
     * whether they are the same object.
     *
     * sameText("hi", new String("hi")) is true.
     *
     * @param a first string
     * @param b second string
     * @return whether they hold the same text
     */
    public boolean sameText(String a, String b) {
        return false;
    }

    /**
     * True only when the two references point at the very same object.
     *
     * sameObject("hi", new String("hi")) is false — same text, two objects.
     *
     * You are writing == on purpose here, so that you can see the difference
     * from sameText above. This is the one place in the course where == on
     * Strings is the right answer.
     *
     * @param a first string
     * @param b second string
     * @return whether they are the same object
     */
    public boolean sameObject(String a, String b) {
        return true;
    }
}

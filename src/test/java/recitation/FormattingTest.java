package recitation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormattingTest {

    private final Formatting ex = new Formatting();

    @Test
    @DisplayName("twoPlaces(0.5142857) is \"0.51\" — the gallons line in SB1")
    void twoPlacesOfGallons() {
        assertEquals("0.51", ex.twoPlaces(180 / 350.0));
    }

    @Test
    @DisplayName("twoPlaces(3.999) is \"4.00\" — formatting rounds, casting chopped")
    void twoPlacesRounds() {
        assertEquals("4.00", ex.twoPlaces(3.999));
    }

    @Test
    @DisplayName("fourPlaces(1.4815297665908702) is \"1.4815\"")
    void fourPlacesOfSpice() {
        assertEquals("1.4815", ex.fourPlaces(1.4815297665908702));
    }

    @Test
    @DisplayName("spiceReport builds the exact sentence SB1 has to print")
    void spiceReportSentence() {
        assertEquals("Well Jean Claude, the spice value resulted in 1.4815",
                ex.spiceReport("Jean Claude", 1.4815297665908702));
    }

    @Test
    @DisplayName("spiceReport works for any name and value")
    void spiceReportWithAnotherName() {
        assertEquals("Well Ada, the spice value resulted in 1.4113",
                ex.spiceReport("Ada", 1.4113072927010246));
    }
}

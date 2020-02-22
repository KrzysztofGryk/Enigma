package Ciphers;

import ciphers.Cipher;
import ciphers.impl.Root13Cipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Root13ChiperTest {
    protected final String textWithNoAlphabeticLetters = "112312[]][";
    protected final String textWithAlphabeticLetters = "abcdd";
    protected final String expectedTextForAlphabeticLetters = "nopqq";
    protected final String mixedText = "123ac//";
    protected final String expectedTextForMixedLettersText = "123np//";
    protected Cipher root13Cipher = new Root13Cipher();
    protected final String textWithUpperAndLowerLetters = "ABCdd";
    protected final String expectedtextWithUpperAndLowerLetters = "NOPqq";

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void testOnlyAlphabeticLettersAreEncoded() {
        String decode = root13Cipher.encode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @DisplayName("Test Text  With Alphabetic Letters")
    @Test
    public void testTextWithAlphabeticLetters() {
        String encode = root13Cipher.encode(textWithAlphabeticLetters);
        Assertions.assertEquals(expectedTextForAlphabeticLetters, encode);
    }

    @DisplayName("Test ExpectedText For Alphabetic Letters")
    @Test
    public void testExpectedTextForAlphabeticLetters() {
        String encode = root13Cipher.encode(mixedText);
        Assertions.assertEquals(expectedTextForMixedLettersText, encode);
    }

    @DisplayName("Testing correction of decoding text with no alphabetic letters")
    @Test
    public void decodeTestOnlyAlphabeticLettersAreEncoded() {
        String decode = root13Cipher.decode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @DisplayName("Test Text decoding  With Alphabetic Letters")
    @Test
    public void decodeTestTextWithAlphabeticLetters() {
        String decode = root13Cipher.decode(expectedTextForAlphabeticLetters);
        Assertions.assertEquals(textWithAlphabeticLetters, decode);
    }

    @DisplayName("Test ExpectedText decoding For Alphabetic Letters")
    @Test
    public void decodeTestExpectedTextForAlphabeticLetters() {
        String decode = root13Cipher.decode(expectedTextForMixedLettersText);
        Assertions.assertEquals(mixedText, decode);
    }

    @DisplayName(" code Text Expected With Upper And Lower")
    @Test
    public void codeTextExpectedWithUpperAndLower() {
        String encode = root13Cipher.encode(textWithUpperAndLowerLetters);
        Assertions.assertEquals(expectedtextWithUpperAndLowerLetters, encode);
    }

    @DisplayName(" dedode Text Expected WithUpper And Lower")
    @Test
    public void dedodeTextExpectedWithUpperAndLower() {
        String decode = root13Cipher.decode(expectedtextWithUpperAndLowerLetters);
        Assertions.assertEquals(textWithUpperAndLowerLetters, decode);
    }
}
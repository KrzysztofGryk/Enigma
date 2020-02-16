package Ciphers;

import ciphers.Cipher;
import ciphers.impl.CesarCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CesarCipherTest {
    protected final String textWithNoAlphabeticLetters = "112312[]][";
    protected final String textWithAlphabeticLetters = "abcdd";
    protected final String expectedTextForAlphabeticLetters = "defgg";
    protected final String mixedText = "123ac//";
    protected final String expectedTextForMixedLettersText = "123df//";
    protected Cipher cesarCipher = new CesarCipher();

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void testOnlyAlphabeticLettersAreEncoded() {
        String decode = cesarCipher.encode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @DisplayName("Test Text  With Alphabetic Letters")
    @Test
    public void testTextWithAlphabeticLetters() {
        String encode = cesarCipher.encode(textWithAlphabeticLetters);
        Assertions.assertEquals(expectedTextForAlphabeticLetters, encode);
    }

    @DisplayName("Test ExpectedText For Alphabetic Letters")
    @Test
    public void testExpectedTextForAlphabeticLetters() {
        String encode = cesarCipher.encode(mixedText);
        Assertions.assertEquals(expectedTextForMixedLettersText, encode);
    }

    @DisplayName("Testing correction of decoding text with no alphabetic letters")
    @Test
    public void decodeTestOnlyAlphabeticLettersAreEncoded() {
        String decode = cesarCipher.decode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @DisplayName("Test Text decoding  With Alphabetic Letters")
    @Test
    public void decodeTestTextWithAlphabeticLetters() {
        String decode = cesarCipher.decode(expectedTextForAlphabeticLetters);
        Assertions.assertEquals(textWithAlphabeticLetters, decode);
    }

    @DisplayName("Test ExpectedText decoding For Alphabetic Letters")
    @Test
    public void decodeTestExpectedTextForAlphabeticLetters() {
        String decode = cesarCipher.decode(expectedTextForMixedLettersText);
        Assertions.assertEquals(mixedText, decode);
    }


}


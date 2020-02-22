package factories;

import ciphers.Cipher;
import ciphers.impl.CesarCipher;
import ciphers.impl.Root13Cipher;
import exceptions.CipherNotFoundException;
import factories.impl.CipherFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CipherFactoryTest {
    private CipherFactory factory = new CipherFactoryImpl();
    private static final String MESSAGE= "Type of Cipher is not recognized";

    @Test
    protected void ifCesarInstanceReturnedWithCesarTypeTest() {
        Cipher cipher = factory.create(CipherFactoryImpl.CEZAR);
        Assertions.assertTrue(cipher instanceof CesarCipher);

    }

    @Test
    protected void ifRootCesarInstanceReturnedWithCesarTypeTest() {
        Cipher cipher = factory.create(CipherFactoryImpl.ROOT13);
        Assertions.assertTrue(cipher instanceof Root13Cipher);
    }
    @Test
    protected void shouldThrowExceptionWithGiveUnknownType(){
        String unknow = "unknown";
        Assertions.assertThrows(CipherNotFoundException.class, () -> factory.create(unknow), MESSAGE+unknow);
    }
}
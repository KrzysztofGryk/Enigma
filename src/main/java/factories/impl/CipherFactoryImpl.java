package factories.impl;

import ciphers.Cipher;
import ciphers.impl.CesarCipher;
import ciphers.impl.Root13Cipher;
import ciphers.impl.VigenereCipher;
import exceptions.CipherNotFoundException;


public class CipherFactoryImpl implements factories.CipherFactory {
    public static final String CEZAR = "cezar";
    public static final String ROOT13 = "root13";
    public static final String VIGENERE = "Vigenere";


    @Override
    public Cipher create(String type) {
        if (type.equals(CEZAR)) {
            return new CesarCipher();
        }
        if (type.equals(ROOT13)) {
            return new Root13Cipher();
        }
        if (type.equals(VIGENERE)) {
            return new VigenereCipher();
        }
        throw new CipherNotFoundException(type);
    }
}

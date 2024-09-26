package e3;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class Encriptar {
    private static final String ENCRYPT_KEY = "8ur8yQPk33d9ubGC";

    public static void main(String[] args) {

        try {
            String text = "Java Standard Edition";
            System.out.println("Texto a encriptar: " + text);

            String textEncrypt = encrypt(text);
            System.out.println("Encriptado: " + textEncrypt);

            String textDecrypt = decrypt(textEncrypt);
            System.out.println("Descifrado: " + textDecrypt);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String encrypt(String text) throws Exception {
        Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);

        byte[] encrypted = cipher.doFinal(text.getBytes());

        return Base64.getMimeEncoder().encodeToString(encrypted);
    }

    private static String decrypt(String encrypted) throws Exception {
        byte[] encryptedBytes = Base64.getDecoder().decode(encrypted.replace("\n", ""));

        Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, aesKey);

        String decrypted = new String(cipher.doFinal(encryptedBytes));

        return decrypted;
    }
}

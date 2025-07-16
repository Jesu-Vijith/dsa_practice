package CryptoGraphy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESEncryptionDecryption {

    // Method to generate a new AES key
    public static SecretKey generateKey(int n) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(n);
        return keyGen.generateKey();
    }

    // Method to encrypt a plaintext string using AES
    public static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Method to decrypt an encrypted string using AES
    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
    public static String secretKeyToString(SecretKey secretKey) {
        byte[] encodedKey = secretKey.getEncoded();  // Get raw byte array of the key
        return Base64.getEncoder().encodeToString(encodedKey);  // Encode to Base64 string
    }

    // Convert String back to SecretKey
    public static SecretKey stringToSecretKey(String keyString) {
        byte[] decodedKey = Base64.getDecoder().decode(keyString);  // Decode Base64 string to byte array
        return new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");  // Recreate the SecretKey
    }

    public static void main(String[] args) {
        try {
            // Generate AES key
            SecretKey key = generateKey(256);// AES-128 bit key
            System.out.println(key);

            String secretKey=secretKeyToString(key);
            System.out.println(secretKey);
            // Sample plaintext
            SecretKey decodedKey=stringToSecretKey(secretKey);
            System.out.println(decodedKey);

            String plainText = "Hello, AES Encryption!";
            System.out.println(plainText);

            // Encrypt the plaintext
            String encryptedText = encrypt(plainText, decodedKey);
            System.out.println("Encrypted: " + encryptedText);

            // Decrypt the ciphertext
            String decryptedText = decrypt(encryptedText, decodedKey);
            System.out.println("Decrypted: " + decryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
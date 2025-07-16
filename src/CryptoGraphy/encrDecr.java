package CryptoGraphy;

import java.util.Arrays;

public class encrDecr {

    static String encrypt(String password) {
        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] + 5);
        }
        return new String(arr);
    }

    static String decrypt(String encryptedPassword) {
        char[] arr = encryptedPassword.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] - 5);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String password="Jesuvijith@123";
        System.out.println(password);
        String encryptPassword=encrypt(password);
        System.out.println(encryptPassword);
        String decryptPassword=decrypt(encryptPassword);
        System.out.println(decryptPassword);
    }
}

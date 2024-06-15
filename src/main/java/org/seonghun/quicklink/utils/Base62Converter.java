package org.seonghun.quicklink.utils;

public class Base62Converter {

    private static final String BASE62_CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int BASE = BASE62_CHARACTERS.length();

    public static String encode(long value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot encode negative value");
        }
        StringBuilder result = new StringBuilder();
        do {
            result.insert(0, BASE62_CHARACTERS.charAt((int) (value % BASE)));
            value /= BASE;
        } while (value > 0);
        return result.toString();
    }

    public static long decode(String base62) {
        long result = 0;
        for (int i = 0; i < base62.length(); i++) {
            result = result * BASE + BASE62_CHARACTERS.indexOf(base62.charAt(i));
        }
        return result;
    }
}
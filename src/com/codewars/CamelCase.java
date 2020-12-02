package com.codewars;

public class CamelCase {

    static String toCamelCase(String s) {
        StringBuilder sbd = new StringBuilder(s);
        for (int i = 0; i < sbd.length(); i++) {
            if (sbd.charAt(i) == '-' || sbd.charAt(i) == '_') {
                sbd.deleteCharAt(i);
                sbd.replace(i+1, i+1, String.valueOf(sbd.charAt(i)).toUpperCase());
                sbd.deleteCharAt(i);
            }
        }
        return sbd.toString();
    }
}

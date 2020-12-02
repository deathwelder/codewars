package com.codewars;

import java.util.Arrays;

public class SpinWords {

    public String spinWords(String sentence) {
            String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5) {
               arr[i] = new StringBuilder(arr[i]).reverse().toString();

            }
        }
        String str = String.join(" ", arr);
       return str;
    }

}

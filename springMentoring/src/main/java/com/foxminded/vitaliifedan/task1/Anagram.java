package com.foxminded.vitaliifedan.task1;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    private String convert(String word) {

        char[] wordChars = word.toCharArray();
        for (int i = 0, j = wordChars.length - 1; i <= j; ) {
            if (!Character.isAlphabetic(wordChars[i])) {
                i++;
            } else if (!Character.isAlphabetic(wordChars[j])) {
                j--;
            } else {
                char c = wordChars[i];
                wordChars[i] = wordChars[j];
                wordChars[j] = c;
                i++;
                j--;
            }
        }

        return new String(wordChars);
    }

    public String reverse(String text) {

        if(text == null) {
            return "";
        }

        String[] words = text.split(" ");
        List<String> reversedWords = new ArrayList<>();
        for (String word : words) {
            reversedWords.add(convert(word));
        }

        return String.join(" ", reversedWords);
    }
}

package com.foxminded.vitaliifedan.task1;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    private String convert(String word) {

        char[] wordChars = word.toCharArray();
        int headIndex = 0;
        int tailIndex = wordChars.length - 1;
        while (headIndex <= tailIndex) {
            if (!Character.isAlphabetic(wordChars[headIndex])) {
                headIndex++;
            } else if (!Character.isAlphabetic(wordChars[tailIndex])) {
                tailIndex--;
            } else {
                char temp = wordChars[headIndex];
                wordChars[headIndex] = wordChars[tailIndex];
                wordChars[tailIndex] = temp;
                headIndex++;
                tailIndex--;
            }
        }

        return new String(wordChars);
    }

    public String reverse(String text) {

        if (text == null) {
            throw new IllegalArgumentException("$text must be String but null returned");
        }

        String[] words = text.trim().split(" ");
        List<String> reversedWords = new ArrayList<>();
        for (String word : words) {
            reversedWords.add(convert(word));
        }

        return String.join(" ", reversedWords);
    }
}

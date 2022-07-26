package com.foxminded.vitaliifedan.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your line: ");
            String line = scanner.nextLine();
            String reversedLine = anagram.reverse(line);
            System.out.println("Your converted line: " + reversedLine);
        }

    }
}

package com.foxminded.vitaliifedan.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    static Anagram anagram;

    @BeforeAll
    static void setup() {
        anagram = new Anagram();
    }

    @Test()
    void Should_EmptyString_When_getNull() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> anagram.reverse(null));
        Assertions.assertEquals("$text must be String but null returned", thrown.getMessage());
    }

    @Test
    void Should_EmptyString_When_getEmptyString() {
        String actualResult = anagram.reverse("");
        Assertions.assertEquals("", actualResult);
    }

    @Test
    void Should_EmptyString_When_getStringWithSeveralSpaces() {
        String actualResult = anagram.reverse("   ");
        Assertions.assertEquals("", actualResult);
    }

    @Test
    void Should_OneCharacter_When_getOneCharacter() {
        String actualResult = anagram.reverse("a");
        Assertions.assertEquals("a", actualResult);
    }

    @Test
    void Should_ReverseTextSymbols_When_getTextOnlyWithSymbols() {
        String actualResult = anagram.reverse("Hello");
        Assertions.assertEquals("olleH", actualResult);
    }

    @Test
    void Should_ReverseOnlyTextSymbols_When_getTextWithDifferentSymbols() {
        String actualResult = anagram.reverse("1Hel2lo#&8k");
        Assertions.assertEquals("1kol2le#&8H", actualResult);
    }

    @Test
    void Should_ReverseWithSaveTextCase_When_getTextWithDifferentCase() {
        String actualResult = anagram.reverse("GooD MoRNInG");
        Assertions.assertEquals("DooG GnINRoM", actualResult);
    }


}

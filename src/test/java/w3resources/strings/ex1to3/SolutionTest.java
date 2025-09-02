package w3resources.strings.ex1to3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "'Ace', 2, 'e'",
            "'Ace', 0, 'A'",
            "'this is a sentence', 5, 'i'",
    })
    public void ex1(String text, int index, char expected){
        assertEquals(expected, Solution.getCharacterAtIndex(text, index));
    }

    @ParameterizedTest
    @CsvSource({
            "'A\uD83D\uDE00BC\uD83D\uDE80D', 0, 65",
            "'π\uD83D\uDE00αβ\uD83C\uDF1Fγ', 3, 945",
            "'A\uD800\uDF48B\uD83D\uDE00C', 5, 56832",
    })
    public void ex2(String text, int index, int expected){
        assertEquals(expected, Solution.getCharacterUnicodeCodePointAtIndex(text, index));
    }

    @ParameterizedTest
    @CsvSource({
            "'A\uD83D\uDE00BC\uD83D\uDE80D', 1, 65",
            "'π\uD83D\uDE00αβ\uD83C\uDF1Fγ', 4, 945",
            "'A\uD800\uDF48B\uD83D\uDE00C', 6, 128512",
    })
    public void ex3(String text, int index, int expected){
        assertEquals(expected, Solution.getCharacterUnicodeCodePointBeforeIndex(text, index));
    }
}
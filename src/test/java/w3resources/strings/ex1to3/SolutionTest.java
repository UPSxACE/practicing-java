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
}
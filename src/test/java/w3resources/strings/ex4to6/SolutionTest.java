package w3resources.strings.ex4to6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "5, 'hello', 0, 5",
            "1, '\uD83D\uDE0A', 0, 2",
            "3, 'a\uD83D\uDE0Ab', 0, 4",
            "3, 'abcdef', 1, 4",
            "3, '\uD83D\uDE80\uD83C\uDF15✨', 1, 5"
    })
    public void ex4(int expected, String str, int start, int end){
        assertEquals(expected, Solution.countUnicodePointsInRange(str, start, end));
    }
}
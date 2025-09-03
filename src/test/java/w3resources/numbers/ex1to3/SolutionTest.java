package w3resources.numbers.ex1to3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "235, false",
            "6, true",
            "20, true",
            "14, false",
            "21, false"
    })
    public void ex1(int num, boolean expected) {
        assertEquals(expected, Solution.checkUglyNumber(num));
    }
}
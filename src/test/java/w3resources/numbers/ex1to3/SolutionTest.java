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

    @Test
    public void ex2(){
        assertArrayEquals(new int[]{2488, 7508, 4}, Solution.categorizeNumbers(10000));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10",
            "100, 1000",
            "-10, 10",
            "-10, 0",
            "-100, -10",
            "-500, 500"
    })
    public void ex3(int start, int stop){
        // test 10000 times
        for(int i = 0; i < 10000; i++){
            var result = Solution.generateRandomIntegerInRange(start, stop);
            assertTrue(result >= start && result < stop);
        }
    }
}
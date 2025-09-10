package w3resources.basics_part_1.ex6to10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "7, 3, 10, 4, 21, 2, 1",
            "-9, 4, -5, -13, -36, -2, -1",
            "7, 1, 8, 6, 7, 7, 0"
    })
    public void ex6(int x, int y, int r1, int r2, int r3, int r4, int r5) {
        assertArrayEquals(new int[]{r1, r2, r3, r4, r5}, w3resources.basics_part_1.ex6to10.Solution.basicArithmeticOperations(x, y));
    }

    @Test
    public void ex7() {
        record Case(
                int number,
                int[] expected
        ) {
        }

        Case[] cases = new Case[]{
                new Case(0, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}),
                new Case(3, new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30}),
                new Case(9, new int[]{9, 18, 27, 36, 45, 54, 63, 72, 81, 90}),
                new Case(-2, new int[]{-2, -4, -6, -8, -10, -12, -14, -16, -18, -20})
        };

        for(var testCase : cases){
            assertArrayEquals(testCase.expected(), Solution.multiplicationTable(testCase.number()));
        }
    }
}
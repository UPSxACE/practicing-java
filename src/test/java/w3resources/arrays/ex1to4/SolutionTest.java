package w3resources.arrays.ex1to4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void ex1() {
        var numberCases = new int[][][]{
                new int[][]{new int[]{1, 9, 10, 2, 5}, new int[]{1, 2, 5, 9, 10}},
                new int[][]{new int[]{-100, 233, 356, 23, -50}, new int[]{-100, -50, 23, 233, 356}},
        };

        var stringCases = new String[][][]{
                new String[][]{new String[]{"dog", "cat", "lemon"}, new String[]{"cat", "dog", "lemon"}},
                new String[][]{new String[]{"dragon", "monkey", "cheese", "fun", "cake"}, new String[]{"cake", "cheese", "dragon", "fun", "monkey"}}
        };

        for(var numCase : numberCases){
            var copy = numCase[0].clone();
            Solution.sortArray(copy);
            assertArrayEquals(numCase[1], copy);
        }

        for(var strCase : stringCases){
            var copy = strCase[0].clone();
            Solution.sortArray(copy);
            assertArrayEquals(strCase[1], copy);
        }
    }
}
package w3resources.arrays.ex1to4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    void ex2(){
        record Case(
            int[] array,
            int expected
        ){}

        Case[] cases = new Case[]{
                new Case(new int[]{4, 19, 2, 0}, 25),
                new Case(new int[]{0, -4, 19, -2}, 13),
                new Case(new int[]{55}, 55),
                new Case(new int[]{}, 0),
        };

        for(var testCase : cases){
            assertEquals(testCase.expected(), Solution.sumAllValuesInArray(testCase.array()));
        }
    }

    @Test
    void ex3(){
        assertEquals(
                """
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -
                        - - - - - - - - - -""", Solution.print10x10GridOfDashes()
        );
    }

    @Test
    void ex4(){
        record Case(
                int[] array,
                double expected
        ){}

        Case[] cases = new Case[]{
                new Case(new int[]{}, 0),
                new Case(new int[]{0, 1, 2, 3, 4}, 2),
                new Case(new int[]{5, 8}, 6.5),
                new Case(new int[]{2, 3, 5, 7}, 4.25),
                new Case(new int[]{-3, 2, 5, -1},0.75),
                new Case(new int[]{-10, -5, 0, 5, 10}, 0),
        };

        for(var testCase : cases){
            assertEquals(testCase.expected(), Solution.calculateAverageArrayElements(testCase.array()));
        }
    }
}
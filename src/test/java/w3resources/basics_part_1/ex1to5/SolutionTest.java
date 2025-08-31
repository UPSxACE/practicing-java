package w3resources.basics_part_1.ex1to5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void ex1(){
        assertEquals("Hello, Ace", Solution.helloAndNamePrinter("Ace"));
        assertEquals("Hello, Crow", Solution.helloAndNamePrinter("Crow"));
        assertEquals("Hello, ", Solution.helloAndNamePrinter(""));
    }

    @Test
    public void ex2(){
        assertEquals(4, Solution.sumOfTwoNumbers(2,2));
        assertEquals(6, Solution.sumOfTwoNumbers(5,1));
        assertEquals(-3, Solution.sumOfTwoNumbers(-5,2));
        assertEquals(-3, Solution.sumOfTwoNumbers(2,-5));
        assertEquals(3, Solution.sumOfTwoNumbers(3,0));
    }

    @Test
    public void ex3(){
        assertEquals(16, Solution.divisionOfTwoNumbers(50,3));
        assertEquals(15, Solution.divisionOfTwoNumbers(45,3));
        assertEquals(3, Solution.divisionOfTwoNumbers(-30,-10));
        assertEquals(-4, Solution.divisionOfTwoNumbers(20,-5));
        assertEquals(0, Solution.divisionOfTwoNumbers(0,5));
    }

    @Test
    public void ex4(){
        var expected = new int[] {43,1,19,13};
        assertArrayEquals(expected, Solution.arithmeticOperations());
    }

    @ParameterizedTest
    @CsvSource({
            "25, 5, 125",
            "0, 1, 0",
            "5, -2, -10"
    })
    public void ex5(int a, int b, int expected){
        assertEquals(expected, Solution.productOfTwoNumbers(a,b));
    }
}

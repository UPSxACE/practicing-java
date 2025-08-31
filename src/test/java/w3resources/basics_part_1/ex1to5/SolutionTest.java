package w3resources.basics_part_1.ex1to5;

import org.junit.jupiter.api.Test;

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
}
package w3resources.basics_part_1.ex1to5;

public class Solution {
    /**
     * Returns hello, and then the given name.
     */
    public static String helloAndNamePrinter(String name){
        return "Hello, " + name;
    }

    /**
     * Return the sum of a and b.
     */
    public static int sumOfTwoNumbers(int a, int b){
        return a + b;
    }

    /**
     * Return the division of a and b.
     */
    public static int divisionOfTwoNumbers(int a, int b){
        return a / b;
    }

    /**
     * Returns an array of numbers with the results of some arithmetic operations.
     */
    public static int[] arithmeticOperations(){
        var op1 = -5 + 8 * 6;
        var op2 = (55 + 9) % 9;
        var op3 = 20 + -3 * 5 / 8;
        var op4 = 5 + 15 / 3 * 2 - 8 % 3;
        return new int[] {op1,op2,op3,op4};
    }

}

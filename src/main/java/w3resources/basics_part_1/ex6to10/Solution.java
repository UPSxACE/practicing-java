package w3resources.basics_part_1.ex6to10;

public class Solution {
    /**
     * Performs several basic arithmetic operations on the two give numbers and
     * returns the results:<br>
     * - The first element is the result of the sum<br>
     * - The second element is the result of the subtraction<br>
     * - The third element is the result of the multiplication<br>
     * - The fourth element is the result of the division<br>
     * - The fifth element is the result of the modulo operation<br>
     */
    public static int[] basicArithmeticOperations(int x, int y){
        return new int[] {
                x + y,
                x - y,
                x * y,
                x / y,
                x % y
        };
    }
}

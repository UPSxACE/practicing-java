package w3resources.strings.ex4to6;

public class Solution {
    /**
     * Counts the Unicode code points in the given text, between the given range.
     */
    public static int countUnicodePointsInRange(String text, int start, int end){
        return text.codePointCount(start, end);
    }
}

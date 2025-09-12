package w3resources.strings.ex4to6;

public class Solution {
    /**
     * Counts the Unicode code points in the given text, between the given range.
     */
    public static int countUnicodePointsInRange(String text, int start, int end){
        return text.codePointCount(start, end);
    }
<<<<<<< Updated upstream
=======

    /**
     * Compares two strings lexicographically. Returns 1 if the first string is lexicographically greater,
     * 0 if equal, and -1 if lesser.
     */
    public static int lexicographicalStringComparison(String str1, String str2){
        if(str1.length() != str2.length())
            return str1.length() > str2.length() ? 1 : -1;

        for(var i = 0; i < str1.length(); i++){
            var dif = str1.codePointAt(i) - str2.codePointAt(i);
            if(dif != 0)
                return dif > 0 ? 1 : -1;
        }

        return 0;
    }
>>>>>>> Stashed changes
}

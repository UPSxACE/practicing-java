package w3resources.strings.ex1to3;

public class Solution {
    /**
     * Gets the character from the given text at the given index.
     */
    public static char getCharacterAtIndex(String text, int position){
        return text.charAt(position);
    }

    /**
     * Gets the Unicode code point from the given text at the given index.
     */
    public static int getCharacterUnicodeCodePointAtIndex(String text, int position){
        return text.codePointAt(position);
    }
}

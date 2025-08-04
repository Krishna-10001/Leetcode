public class Solution {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "Hello World",
            "   fly me   to   the moon  ",
            "luffy is still joyboy"
        };

        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\"");
            System.out.println("Output: " + lengthOfLastWord(testCase));
            System.out.println();
        }
    }
}

public class Solution {
    public static String solution(String myString, String overwriteString, int s) {
        int length = overwriteString.length();
        return myString.substring(0, s) + overwriteString + myString.substring(s + length);
    }
}
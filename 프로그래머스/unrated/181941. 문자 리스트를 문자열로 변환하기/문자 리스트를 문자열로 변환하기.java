public class Solution {
    public static String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String element : arr) {
            sb.append(element);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        String result = solution(arr);
        System.out.println(result);
    }
}

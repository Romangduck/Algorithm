class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            int index = index_list[i];
            if (index >= 0 && index < my_string.length()) {
                answerBuilder.append(my_string.charAt(index));
            }
        }
        return answerBuilder.toString();
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int a = my_string.length();
    for(int i = 0; i<my_string.length(); i++) {
        answer +=  my_string.charAt(a-i-1);
    }
     return answer;
    }
}
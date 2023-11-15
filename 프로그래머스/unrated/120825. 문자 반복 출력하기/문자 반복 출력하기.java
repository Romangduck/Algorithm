class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
    for(int i = 0; i < my_string.length(); i++) {
        char a = my_string.charAt(i);
        String repeat = String.valueOf(a).repeat(n);
        answer.append(repeat);
    
    }
        return answer.toString();
        
    }
    
}
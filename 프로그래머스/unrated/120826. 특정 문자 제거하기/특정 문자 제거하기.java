class Solution {
    public String solution(String my_string, String letter) {
        
        StringBuilder answer = new StringBuilder();
        
        for (int i =0; i<my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(!Character.toString(a).equals(letter)){
                answer.append(a);
            }
        }
        return answer.toString();
    }
}
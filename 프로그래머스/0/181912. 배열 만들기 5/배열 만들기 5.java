import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for (String str : intStrs) {
            int endIndex = s + l;
            int strValue = Integer.parseInt(str.substring(s, endIndex));
            
            if (k < strValue) {
                answer.add(strValue);
            }
        }
        
        return answer;
    }
}

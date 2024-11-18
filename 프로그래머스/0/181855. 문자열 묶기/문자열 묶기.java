import java.util.HashMap;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            if (map.containsKey(len)) {
                map.put(len, map.get(len) + 1);
            } else {
                map.put(len, 1);
            }
        }
        int max = 0;
        for (int len : map.keySet()) {
            int count = map.get(len);
            if (max < count) {
                max = count;
            }
        }
        int answer = max;
        return answer;
    }
}
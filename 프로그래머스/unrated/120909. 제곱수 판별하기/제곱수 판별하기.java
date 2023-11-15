class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % (i * i) == 0) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}

import java.util.Scanner;

public class Solution {
    public static int solution(int n) {
        if (n % 2 == 1) {
            int sum = 0;
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            return sum;
        } else {
            int sum1 = 0;
            for (int i = 2; i <= n; i += 2) {
                sum1 += i * i;
            }
            return sum1;
        }
    }
}

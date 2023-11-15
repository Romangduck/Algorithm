class Solution {
  public int solution(int a, int b) {
    String ab = Integer.toString(a) + Integer.toString(b);
    
    int baAnswer = 2 * a *b;

    int abAnswer = Integer.parseInt(ab);

    return Math.max(abAnswer, baAnswer);

  }
}
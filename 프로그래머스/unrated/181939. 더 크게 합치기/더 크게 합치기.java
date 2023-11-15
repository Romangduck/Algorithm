class Solution {
    public int solution(int a , int b) {
    String ab= Integer.toString(a) + Integer.toString(b);
    String ba= Integer.toString(b) + Integer.toString(a);
    
    int abAnswer = Integer.parseInt(ab);
    int baAnswer = Integer.parseInt(ba);
    
    return Math.max(abAnswer , baAnswer);
    
  }
}



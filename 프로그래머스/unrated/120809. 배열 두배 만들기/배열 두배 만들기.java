class Solution {
    public int[] solution(int[] numbers) {
        int[] n = new int[numbers.length];
      for (int i = 0; i<numbers.length; i++) {
          n[i] = numbers[i] * 2;
          
      }
        return n;
    }
}
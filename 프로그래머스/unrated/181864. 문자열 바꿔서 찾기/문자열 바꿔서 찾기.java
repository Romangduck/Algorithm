class Solution {
public int solution(String myString, String pat) {
    int answer = 0;

    myString = myString.replace("A", "temp").replace("B", "A").replace("temp", "B");

    if (myString.contains(pat)) {
      answer = 1;
    }

    return answer;
  }
}
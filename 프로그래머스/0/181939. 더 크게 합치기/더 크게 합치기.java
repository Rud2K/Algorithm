class Solution {
  public int solution(int a, int b) {
    int result1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
    int result2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
    return Math.max(result1, result2);
  }
}
class Solution {
  public String solution(String myString, String overwriteString, int s) {
    String str1 = myString.substring(0, s);
    String str2 = myString.substring(s + overwriteString.length());

    StringBuilder sb = new StringBuilder();
    sb.append(str1).append(overwriteString).append(str2);

    return sb.toString();
  }
}
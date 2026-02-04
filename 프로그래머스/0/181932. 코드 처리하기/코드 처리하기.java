class Solution {
  public String solution(String code) {
    StringBuilder result = new StringBuilder();
    int mode = 0;
    char[] arr = code.toCharArray();

    for (int i = 0; i < arr.length; i++) {
      if (mode == 0) {
        if (arr[i] != '1') {
          if (i % 2 == 0) result.append(arr[i]);
        } else {
          mode = 1;
        }
      } else {
        if (arr[i] != '1') {
          if (i % 2 != 0) result.append(arr[i]);
        } else {
          mode = 0;
        }
      }
    }

    return result.length() == 0 ? "EMPTY" : result.toString();
  }
}
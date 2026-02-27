import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
          String str = Integer.toString(i);
          str = str.replace("0", "").replace("5", "");

          if (str.isEmpty()) {
            list.add(i);
          }
        }

        if (list.isEmpty()) {
          return new int[]{-1};
        } else {
          int[] result = new int[list.size()];
          for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
          }
          return result;
        }
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < queries.length; i++) {
          int a = queries[i][0];
          int b = queries[i][1];

          int temp = result[a];
          result[a] = result[b];
          result[b] = temp;
        }

        return result;
    }
}
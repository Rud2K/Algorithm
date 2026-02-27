class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
          int s = queries[i][0];
          int e = queries[i][1];
          int k = queries[i][2];

          for (int j = 0; j < arr.length; j++) {
            if (s <= j && j <= e) {
              if (j % k == 0) arr[j] += 1;
            }
          }
        }

        return arr;
    }
}
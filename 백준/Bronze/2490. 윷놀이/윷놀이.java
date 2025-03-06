import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = 3;
    int m = 4;
    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    char[] result = new char[n];

    for (int i = 0; i < n; i++) {
      int count = 0;

      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 1) count++;
      }

      switch (count) {
        case 4:
          result[i] = 'E';
          break;
        case 3:
          result[i] = 'A';
          break;
        case 2:
          result[i] = 'B';
          break;
        case 1:
          result[i] = 'C';
          break;
        case 0:
          result[i] = 'D';
          break;
        default:
          break;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.println(result[i]);
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[][] students = new int[6][2];

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int gender = Integer.parseInt(st.nextToken());
      int year = Integer.parseInt(st.nextToken()) - 1;
      students[year][gender]++;
    }

    int result = 0;
    for (int[] arr : students) {
      for (int count : arr) {
        if (count > 0) {
          result += (count + k - 1) / k;
        }
      }
    }

    System.out.println(result);
  }
}

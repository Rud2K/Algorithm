import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[M];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0;
    int sum = 0;

    for (int i = 0; i < M; i++) {
      if (arr[i] > max) max = arr[i];
      sum += arr[i];
    }

    System.out.println((double) sum * 100 / max / M);
  }
}

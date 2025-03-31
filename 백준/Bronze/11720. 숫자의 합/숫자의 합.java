import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    char[] arr = br.readLine().toCharArray();
    int result = 0;

    for (int i = 0; i < N; i++) {
      int temp = (int) (arr[i] - '0');
      result += temp;
    }

    System.out.println(result);
  }
}

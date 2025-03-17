import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String n = br.readLine();
    int[] count = new int[10];
    int result = 0;

    for (int i = 0; i < n.length(); i++) {
      int temp = n.charAt(i) - '0';
      count[temp]++;
    }

    count[6] = (count[6] + count[9] + 1) / 2;
    count[9] = 0;

    for (int j : count) {
      result = Math.max(result, j);
    }

    System.out.println(result);
  }
}

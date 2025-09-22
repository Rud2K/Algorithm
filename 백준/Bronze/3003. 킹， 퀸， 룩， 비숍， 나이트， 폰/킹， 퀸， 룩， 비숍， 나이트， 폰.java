import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");
    int[] values = {1, 1, 2, 2, 2, 8};
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
      sb.append(values[i] - Integer.parseInt(input[i])).append(" ");
    }

    System.out.println(sb.toString().trim());
  }
}
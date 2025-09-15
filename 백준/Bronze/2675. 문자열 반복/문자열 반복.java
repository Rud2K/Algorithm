import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < t; i++) {
      String input = br.readLine();
      int r = Integer.parseInt(input.substring(0, 1).trim());
      String s = input.substring(2).trim();

      for (char c : s.toCharArray()) {
        for (int j = 0; j < r; j++) {
          sb.append(c);
        }
      }
      sb.append("\n");
    }

    System.out.println(sb.toString());
  }
}
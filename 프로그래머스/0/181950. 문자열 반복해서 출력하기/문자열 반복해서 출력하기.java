import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String str = input.split(" ")[0];
    int n = Integer.parseInt(input.split(" ")[1]);

    for (int i = 0; i < n; i++) {
      System.out.print(str);
    }
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String[] parts = input.split(" ");

    StringBuilder sb = new StringBuilder();
    for (String part : parts) {
      sb.append(part);
    }

    System.out.println(sb.toString());
  }
}
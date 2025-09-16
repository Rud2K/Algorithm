import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine().trim();

    if (str.isEmpty()) {
      System.out.println(0);
      return;
    }

    int count = 0;
    boolean isWord = false;

    for (char c : str.toCharArray()) {
      if (c == ' ') {
        isWord = false;
      } else {
        if (!isWord) {
          count++;
          isWord = true;
        }
      }
    }

    System.out.println(count);
  }
}
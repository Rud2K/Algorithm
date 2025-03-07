import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] result = new  int[26];

    for (int i = 0; i < 26; i++) {
      result[i] = 0;
    }

    char[] cArr = st.nextToken().toUpperCase().toCharArray();

    for (char c : cArr) {
      result[c - 'A']++;
    }

    StringBuilder sb = new StringBuilder();

    for (int n : result) {
      sb.append(n).append(" ");
    }

    System.out.println(sb.toString());
  }
}

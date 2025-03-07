import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = 3;
    int value = 1;
    int[] intArr = new int[n];

    for (int i = 0; i < n; i++) {
      intArr[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < n; i++) {
      value *= intArr[i];
    }

    String str = Integer.toString(value);
    int[] result = new int[10];

    for (int i = 0; i < str.length(); i++) {
      int temp = str.charAt(i) - '0';
      result[temp]++;
    }

    for (int j : result) {
      System.out.println(j);
    }
  }
}

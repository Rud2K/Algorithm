import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] arr = br.readLine().toCharArray();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      if (Character.isLowerCase(arr[i])) {
        arr[i] = Character.toUpperCase(arr[i]);
        sb.append(arr[i]);
      } else {
        arr[i] = Character.toLowerCase(arr[i]);
        sb.append(arr[i]);
      }
    }

    System.out.println(sb.toString());
  }
}
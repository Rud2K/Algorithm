import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] arr = br.readLine().split(" ");

    for (int i = 0; i < arr.length; i++) {
      StringBuilder sb = new StringBuilder(arr[i]);
      arr[i] = sb.reverse().toString();
    }

    System.out.println(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) ? arr[0] : arr[1]);
  }
}
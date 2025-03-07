import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] dwarves = new int[9];
    int totalSum = 0;

    for (int i = 0; i < dwarves.length; i++) {
      dwarves[i] = Integer.parseInt(br.readLine());
      totalSum += dwarves[i];
    }

    boolean isFound = false;
    int[] result = new int[7];

    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 9; j++) {
        if (totalSum - (dwarves[i] + dwarves[j]) == 100) {
          int index = 0;
          for (int k = 0; k < 9; k++) {
            if (k != i && k != j) result[index++] = dwarves[k];
          }
          isFound = true;
          break;
        }
      }
      if (isFound) break;
    }

    Arrays.sort(result);
    for (int n : result) {
      System.out.println(n);
    }
  }
}

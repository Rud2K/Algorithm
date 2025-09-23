import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(findMostFrequentLetter(br.readLine()));
  }

  private static char findMostFrequentLetter(String word) {
    char result = ' ';

    Map<Character, Integer> frequencies = new HashMap<>();

    for (char c : word.toUpperCase().toCharArray()) {
      frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
    }

    int maxCount = 0;
    boolean duplicate = false;

    for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
      int count = entry.getValue();

      if (count > maxCount) {
        maxCount = count;
        result = entry.getKey();
        duplicate = false;
      } else if (count == maxCount) {
        duplicate = true;
      }
    }

    return duplicate ? '?' : result;
  }
}
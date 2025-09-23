import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(findPalindrome(br.readLine()));
  }

  private static int findPalindrome(String word) {
    final int LEN = word.length();

    char[] normalArr = word.toCharArray();
    char[] reverseArr = new char[LEN];

    for (int i = 0; i < LEN; i++) {
      reverseArr[i] = normalArr[normalArr.length - 1 - i];
    }

    String normalStr = String.valueOf(normalArr);
    String reverseStr = String.valueOf(reverseArr);

    return normalStr.equals(reverseStr) ? 1 : 0;
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 7; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num % 2 != 0) {
        list.add(num);
      }
    }

    if (list.isEmpty()) {
      System.out.println(-1);
      return;
    }

    Collections.sort(list);

    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    System.out.println(sum);
    System.out.println(list.get(0));
  }
}

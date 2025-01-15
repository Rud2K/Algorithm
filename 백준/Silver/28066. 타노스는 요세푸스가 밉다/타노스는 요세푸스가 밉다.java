import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] input = br.readLine().split(" ");
    
    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);
    
    Deque<Integer> deque = new ArrayDeque<>();
    
    for (int i = 1; i <= n; i++) {
      deque.addLast(i);
    }
    
    while (deque.size() >= k) {
      deque.addLast(deque.pollFirst());
      for (int i = 1; i < k; i++) {
        deque.pollFirst();
      }
    }
    
    System.out.println(deque.peekFirst());
  }
}

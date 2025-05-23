import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    
    int[] sequence = new int[n];
    for (int i = 0; i < n; i++) {
      sequence[i] = Integer.parseInt(input[i]);
    }
    
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[n];
    
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= sequence[i]) {
        stack.pop();
      }
      
      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        result[i] = stack.peek();
      }
      
      stack.push(sequence[i]);
    }
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(result[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}
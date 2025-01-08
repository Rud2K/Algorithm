import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    String[] height = br.readLine().split(" ");
    
    int[] result = new int[n];
    Stack<int[]> stack = new Stack<>();
    
    for (int i = 0; i < n; i++) {
      int cur = Integer.parseInt(height[i]);
      
      while (!stack.isEmpty() && stack.peek()[1] < cur) {
        stack.pop();
      }
      
      if (!stack.isEmpty()) {
        result[i] = stack.peek()[0];
      } else {
        result[i] = 0;
      }
      
      stack.push(new int[] {i + 1, cur});
    }
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(result[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}
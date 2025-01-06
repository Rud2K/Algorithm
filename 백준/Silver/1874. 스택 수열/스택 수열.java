import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    
    int cur = 1;
    boolean flag = false;
    
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      
      for ( ; cur <= n; cur++) {
        stack.push(cur);
        sb.append("+\n");
      }
      
      if (stack.peek() == n) {
        stack.pop();
        sb.append("-\n");
      } else {
        flag = true;
      }
    }
    
    if (flag) {
      System.out.println("NO");
    } else {
      System.out.println(sb.toString().trim());
    }
  }
}

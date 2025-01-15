import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = br.readLine();
    
    Deque<Integer> bIndices = new ArrayDeque<>();
    Deque<Integer> aIndices = new ArrayDeque<>();
    
    int removalCount = 0;
    
    for (int i = 0; i < s.length(); i++) {
      char curChar = s.charAt(i);
      
      if (curChar == 'C') {
        if (!bIndices.isEmpty() && bIndices.peekFirst() < i) {
          removalCount++;
          bIndices.pollFirst();
        }
      } else if (curChar == 'B') {
        bIndices.addLast(i);
      } else if (curChar == 'A') {
        aIndices.addLast(i);
      }
    }
    
    while (!aIndices.isEmpty() && !bIndices.isEmpty()) {
      if (aIndices.peekFirst() < bIndices.peekFirst()) {
        removalCount++;
        aIndices.pollFirst();
        bIndices.pollFirst();
      } else {
        bIndices.pollFirst();
      }
    }
    
    System.out.println(removalCount);
  }
}
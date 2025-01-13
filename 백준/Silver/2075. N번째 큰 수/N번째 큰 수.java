import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for (int i = 0; i < n; i++) {
      String[] row = br.readLine().split(" ");
      
      for (int j = 0; j < n; j++) {
        int value = Integer.parseInt(row[j]);
        minHeap.add(value);
        
        if (minHeap.size() > n) {
          minHeap.poll();
        }
      }
    }
    
    System.out.println(minHeap.peek());
  }
}
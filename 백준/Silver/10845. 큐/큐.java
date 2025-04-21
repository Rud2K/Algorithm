import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    MyQueue q = new MyQueue();
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String input = st.nextToken();

      switch (input) {
        case "push":
          q.push(Integer.parseInt(st.nextToken()));
          break;
        case "pop":
          sb.append(q.pop()).append("\n");
          break;
        case "size":
          sb.append(q.size()).append("\n");
          break;
        case "empty":
          sb.append(q.empty()).append("\n");
          break;
        case "front":
          sb.append(q.front()).append("\n");
          break;
        case "back":
          sb.append(q.back()).append("\n");
          break;
      }
    }

    System.out.println(sb.toString());
  }
}

class MyQueue {
  private final Queue<Integer> queue;

  public MyQueue() {
    this.queue = new LinkedList<>();
  }

  public void push(int n) {
    this.queue.add(n);
  }

  public int pop() {
    return this.queue.isEmpty() ? -1 : this.queue.poll();
  }

  public int size() {
    return this.queue.size();
  }

  public int empty() {
    return this.queue.isEmpty() ? 1 : 0;
  }

  public int front() {
    return this.queue.isEmpty() ? -1 : this.queue.peek();
  }

  public int back() {
    return this.queue.isEmpty() ? -1 : ((LinkedList<Integer>) this.queue).getLast();
  }
}

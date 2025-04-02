import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());

    MyStack myStack = new MyStack(N);

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push":
          myStack.push(Integer.parseInt(st.nextToken()));
          break;
        case "pop":
          System.out.println(myStack.pop());
          break;
        case "size":
          System.out.println(myStack.size());
          break;
        case "empty":
          System.out.println(myStack.empty());
          break;
        case "top":
          System.out.println(myStack.top());
          break;
      }
    }
  }
}

class MyStack {

  private final int[] arr;
  private int ptr;

  public MyStack(int capacity) {
    this.arr = new int[capacity];
    this.ptr = 0;
  }

  public void push(int n) {
    arr[ptr++] = n;
  }

  public int pop() {
    return ptr == 0 ? -1 : arr[--ptr];
  }

  public int size() {
    return ptr;
  }

  public int empty() {
    return ptr == 0 ? 1 : 0;
  }

  public int top() {
    return ptr == 0 ? -1 : arr[ptr - 1];
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int M = Integer.parseInt(br.readLine());
    String[] strScores = br.readLine().split(" ");

    if (strScores.length != M) return;

    int max = Integer.parseInt(strScores[0]);
    for (int i = 1; i < M; i++) {
      int target = Integer.parseInt(strScores[i]);
      if (max < target) max = target;
    }

    double[] dblScores = new double[M];
    double sum = 0.0;

    for (int i = 0; i < M; i++) {
      dblScores[i] = Double.parseDouble(strScores[i]) / max * 100;
      sum += dblScores[i];
    }

    System.out.println(sum / M);
  }
}

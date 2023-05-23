import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N+1];
        for (int i = 1; i < N+1; i++) {
           x[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(x);

        int sum=0;
        for (int i = 1; i <= N; i++) {
            sum += Math.abs(i - x[i]);
        }
        System.out.println(sum);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int start = 0;

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            if (N > start) {
                for (int i = start + 1; i <= N; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = N;
            }
            if (stack.peek() == N) {
                stack.pop();
                sb.append("-").append("\n");
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
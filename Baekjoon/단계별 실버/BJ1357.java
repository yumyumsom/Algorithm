import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ1357 {
    static String x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = st.nextToken();
        y = st.nextToken();
        String ans = String.valueOf(Rev(x) + Rev(y));
        System.out.println(Rev(ans));

    }

    static int Rev(String num) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            stack.push(num.charAt(i));
        }
        num = "";
        while (!stack.isEmpty()) {
            num += stack.pop();
        }
        return Integer.parseInt(num);
    }
}
